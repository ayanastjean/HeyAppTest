pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Pull the latest code from the repository
                    sh 'git pull origin main'
                    // Build the application using Maven
                    sh 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run unit tests
                    sh 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Deploy your application (this could be a Docker command or any other deployment step)
                    sh 'docker build -t your-image-name .'
                    sh 'docker run -d -p 8080:8080 your-image-name'
                }
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
