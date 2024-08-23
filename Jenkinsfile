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
            steps {
                script {
                    gv.buildImage()
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
