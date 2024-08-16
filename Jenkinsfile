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
      steps {
        echo "Pushing project ..."
      }
    }
  }

  post {
    success {
      echo "Pipeline finished with success status"
    }
  }
}
