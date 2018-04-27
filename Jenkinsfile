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
             
      	     wrap([$class: "RundeckNotifier"]){
      	     		jobId =1 
					echo 'deployment'      				
      				}
  			 }
           
    		}
    	}
	}
}
