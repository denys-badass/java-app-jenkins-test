pipeline {
  agent any
    
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
      environment {
          GITHUB_BRANCH = 'main'
        }
      when {
          expression { env.GITHUB_BRANCH == 'main' }
      }
      steps {
        echo "Pushing project ..."
      }
    }
  }
}
