pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            
                echo 'Building....'
                sh 'mvn install'
                echo 'mvn' 

             }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
             echo 'deploying..'
             step([$class: "RundeckNotifier", 
             url: "http://localhost:4440/", 
             Login: "admin",
             Password: "admin", 
             jobId: "1"])
    		}
    	}
	}
}
