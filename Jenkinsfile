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
          			
          		
          			jobId: "1"])
  		}
           
    		}
    }
}
}
