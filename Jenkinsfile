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
            	dir('/var/lib/jenkins/workspace/Miniproject_pipeline/target/'){
            	sh ' touch cars.dat'
            	sh 'java -jar DevOps-1.0-SNAPSHOT.jar'
            	}
            	build 'rundeck_job'
			}
	}
}
}
