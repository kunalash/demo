pipeline {
    agent any

    environment {
        // Set up Maven environment variables
        PATH = "${tool 'maven-3.8.8'}/bin;${env.PATH}"
        M2_HOME = "${tool 'maven-3.8.8'}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Here, you can checkout your source code from version control (e.g., Git)
                // For example, if using Git:
                // bat 'git clone https://github.com/your/repo.git'
             checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '86b79e6c-5710-4889-93aa-1571f615a76c', url: 'https://github.com/kunalash/demo.git']])
            }
        }

        stage('Build') {
            steps {
                // Run Maven to build the project
                // Adjust the Maven goals and options according to your project
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run Maven to execute tests
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Run Maven to deploy your project artifacts to a repository
                // For example, if using Maven Deploy Plugin:
                // bat 'mvn deploy'
                  bat 'mvn install -DskipTests'
            }
        }

        // Add more stages as needed for your specific build and deployment process
    }

    post {
        always {
            // Clean up any artifacts or resources if needed
            // For example, if you have build artifacts to clean up:
            bat 'mvn clean'
        }

     }
}	 
