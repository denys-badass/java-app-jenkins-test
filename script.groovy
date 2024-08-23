def buildApp() {
    echo 'Building the application...'
    sh 'mvn package'
}

def testApp() {
    echo 'Testing the application...'
    sh 'mvn test'
}

def buildImage() {
    withCredentials([usenamePassword(credentialsID: 'docker-hub', usernameVariable: 'USER', passwordVariable: 'PWD')]) {
        sh 'docker build -t dennydobry/test-java-app:jma-1.2 .'
        sh 'echo $PWD | docker login -u $USER --password-input'
        sh 'docker push'
    }
}

def deployApp() {
    echo "Deploy App version..."
}

return this
