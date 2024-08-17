pipeline {
    agent any
  
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'VERSION of the App')
        booleanParam(name: 'executeTest', defaultValue: true, description: 'do test')
    }
    
    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'script.groovy'
                }
            }
        }
        stage('Build') {
            steps {
                gv.buildApp()
            }
        }
        
        stage('Test') {
            when {
                expression {
                    params.executeTest
                }
            }
            steps {
                gv.testApp()
            }
        }
        
        stage('Deploy') {
            steps {
                gv.deployApp()
            }
        }
    }
}
