pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
            
                echo 'Building..'
                dir Second_Sale_Car_Market & mvn install
                echo 'mvn' 

             }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
