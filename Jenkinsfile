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
                expression { "$GITHUB_BRANCH == 'main' }
            }
            steps {
                echo "Pushing project ..."
            }
        }
    }
}
