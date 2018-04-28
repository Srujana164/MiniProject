pipeline {
    agent any
	node('master') {
    sh'''
        echo 'Hello, world!'
    '''
    logstashSend failBuild: true, maxLines: 1000
	
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
             jobId: "20a9f04f-e4ca-4482-9295-3b4a69ce4145",
             nodeFilters: "",
      		rundeckInstance: "Default",
      		shouldFailTheBuild: true,
      		shouldWaitForRundeckJob: true,
      		tags: "",
      		tailLog: true])
    		}
    	}
    	
	}
	}
}
