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
             script {
             echo 'deployment'
    			step([$class: "RundeckNotifier",
          			
          			URL: "http://localhost:4440",
          			Login: "admin",
          			Password: "admin",
          			includeRundeckLogs: true,
          			jobId: "1"])
  		}
           
    		}
    }
}
}
