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
      when {
          branch 'main'
      }
      steps {
        echo "Pushing project ..."
      }
    }
  }
}
