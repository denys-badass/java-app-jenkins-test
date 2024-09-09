#!/usr/bin/env groovy


@Library('shared-lib')
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
                    sh "echo Execute pipeline in the $BRANCH_NAME branch"
                }
            }
        }
        stage('Build App') {
            when {
                expression {
                    BRANCH_NAME == 'main' || BRANCH_NAME == 'develop'
                }
            }
            steps {
                script {
                    buildMavenApp()
                }
            }
        }
        
        stage('Test App') {
            steps {
                script {
                    testMavenApp()
                }
            }
        }
        
        stage('Build Image') {
            when {
                expression {
                    BRANCH_NAME == 'main'
                }
            }
            steps {
                script {
                    buildDockerImage()
                }
            }
        }

        stage('Deploy') {
            when {
                expression {
                    BRANCH_NAME == 'main'
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
