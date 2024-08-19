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
                script {
                    gv.buildApp()
                }
            }
        }
        
        stage('Test') {
            when {
                expression {
                    params.executeTest
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        
        stage('Deploy') {
            input {
                message 'Enter the environment'
                ok 'Done'
                parameters {
                    choice(name: 'ENV', choices: ['dev', 'test', 'prod'], description: 'Environment of deploy')
                }
            }
            steps {
                script {
                    gv.deployApp()
                    echo "App has been deployed in ${ENV} environment"
                }
            }
        }
    }
}
