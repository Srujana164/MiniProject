pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
             wrap([$class: 'Xvfb', screen: '1440x900x24']) {
                echo 'Building..'
            
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
