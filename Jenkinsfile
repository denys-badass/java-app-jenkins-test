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
                    gv = load "script.groovy"
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
                    buildDockerImage 'dennydobry/test-java-app:jma-1.4'
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
