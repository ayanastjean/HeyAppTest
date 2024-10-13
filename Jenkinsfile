pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {

                    sh 'git pull origin main'

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

                    sh 'docker build -t heyapp .'
                    sh 'docker run -d -p 8081:8080 heyapp'
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
