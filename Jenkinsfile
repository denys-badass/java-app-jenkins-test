pipeline {
    agent any
  
    environment {
        GITHUB_BRANCH = 'main'
        USER = 'denys'
        PWD = 'somepassword'
    }
    
    stages {
        stage('Build') {
            steps {
                echo "Building project ..."
            }
        }
        
        stage('Test') {
            steps {
                echo "Testing project ..."
            }
        }
        
        stage('Push') {
            when {
                expression { "$GITHUB_BRANCH" == 'main' }
            }
            steps {
                echo "We loged in docker with $USER username and $PWD password"
            }
        }
    }
}
