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
        RESULT=somevars.env
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
    unsuccessful {
      echo "Pipeline finished with success status"
    }
  }
}
