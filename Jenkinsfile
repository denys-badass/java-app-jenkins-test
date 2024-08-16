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
      environment {
        RESULT = currentBuild.result
      }
      echo "Pipeline finished with $RESULT status"
    }
  }
}
