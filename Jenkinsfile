pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            
                echo 'Building..'
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
           
            wrap([$class: 'Xvfb', screen: '1440x900x24']) {

  		echo 'Deploying....'
  		dir ('target')
		}
                
            }
        }
    }
}
