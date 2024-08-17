def buildApp() {
    echo 'Building the application...'
}

def testApp() {
    echo 'Testing the application...'
}

def deployApp() {
    echo 'Deploy App version ${params.VERSION}'
}

return this
