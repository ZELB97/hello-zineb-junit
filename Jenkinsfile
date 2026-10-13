pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Verification Java') {
    steps {
        sh '''
            mvn -version
            java -version
            javac -version
            echo "JAVA_HOME=$JAVA_HOME"
            command -v javac
        '''
    }
}
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
