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
             jobId: "20a9f04f-e4ca-4482-9295-3b4a69ce4145"])
    		}
    	}
	}
}
