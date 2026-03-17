pipeline {

    agent any

    tools {
        maven 'My_Maven'
        jdk 'MyJava'
    }

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run TestNG Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Publish TestNG Results') {
            steps {
                testNG(
                    reportFilenamePattern: '**/target/surefire-reports/testng-results.xml'
                )
            }
        }

        stage('Publish HTML Report') {
            steps {
                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/surefire-reports',
                    reportFiles: 'index.html',
                    reportName: 'TestNG HTML Report'
                ])
            }
        }
    }
}