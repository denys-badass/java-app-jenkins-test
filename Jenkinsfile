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
    fixed {
      echo "Pipeline finished with success status but previous was failed"
    }
  }
}
