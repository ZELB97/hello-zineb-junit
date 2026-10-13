pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Tests JUnit') {
            steps {
                sh 'mvn clean test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
