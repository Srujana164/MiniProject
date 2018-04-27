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
             echo 'deploying..'
             step([$class: "RundeckNotifier",  
             jobId: "20a9f04f-e4ca-4482-9295-3b4a69ce4145"
             nodeFilters: "",
      		 options: """
             	PARAM_1=value1
             	PARAM_2=value2
             	PARAM_3=
                """,
      		rundeckInstance: "Default",
      		shouldFailTheBuild: true,
      		shouldWaitForRundeckJob: true,
      		tags: "",
      		tailLog: true])
    		}
    	}
	}
}
