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
    			step([$class: "RundeckNotifier",
          			includeRundeckLogs: true,
          			jobId: "1"
          rundeckInstance: "Default",
          shouldFailTheBuild: true,
          shouldWaitForRundeckJob: true,
          tags: "",
          tailLog: true])
  }
           
    		}
    }
}
