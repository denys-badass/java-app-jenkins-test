pipeline {
    agent any
  
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'VERSION of the App')
        booleanParam(name: 'executeTest', defaultValue: true, description: 'do test')
    }
    
    stages {
        stage('Build') {
            steps {
                echo "Building project ..."
            }
        }
        
        stage('Test') {
            when {
                expression {
                    params.executeTest
                }
            }
            steps {
                echo "Testing project ..."
            }
        }
        
        stage('Push') {
            steps {
                echo "Pushed app version ${params.VERSION}"
            }
        }
    }
}
