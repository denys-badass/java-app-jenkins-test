pipeline {
    agent any
  
    environment {
        GITHUB_BRANCH = 'main'
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
                withCredentials([
                    usernamePassword(credentials: 'docker-hub', usernameVariable: USER, passwordVariable: PWD)
                ]) {
                    sh 'echo "We loged in docker with $USER username and $PWD password"'
                }
            }
        }
    }
}
