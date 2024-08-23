def buildApp() {
    echo 'Building the application...'
    sh 'mvn package'
}

def testApp() {
    echo 'Testing the application...'
    sh 'mvn test'
}

def buildImage() {
    withCredentials([usernamePassword(credentialsId: 'docker-hub', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh 'docker build -t dennydobry/test-java-app:jma-1.2 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push dennydobry/test-java-app:jma-1.2'
    }
}

def deployApp() {
    echo "Deploy App version..."
}

return this
