def gv

pipeline {
    agent any
  
    tools {
      maven 'maven-3.9.8'
    }
    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'script.groovy'
                }
            }
        }
        stage('Build App') {
            when {
                expression {
                    BRANCHE_NAME == 'main' || BRANCHE_NAME == 'develop'
                }
            }
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        
        stage('Test App') {
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        
        stage('Build Image') {
            when {
                expression {
                    BRANCHE_NAME == 'main'
                }
            }
            steps {
                script {
                    gv.buildImage()
                }
            }
        }

        stage('Deploy') {
            when {
                expression {
                    BRANCHE_NAME == 'main'
                }
            }
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
