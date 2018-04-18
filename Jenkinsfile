pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
             wrap([$class: 'Xvfb', screen: '1440x900x24']) {
                echo 'Building..'
                cd Second_Sale_Car_Market
                mvn install
                echo 'mvn' 
            
}

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
