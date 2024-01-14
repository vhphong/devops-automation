pipeline {
    agent any
    tools{
        maven 'maven_3_8_8'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'github_credentials', url: 'https://github.com/vhphong/devops-automation']])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker image'){
            steps{
                script{
                    bat 'docker build -t phongvo0222/devops-automation-integration .'
                }
            }
        }
        stage('Push image to DockerHub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        bat "docker login -u phongvo0222 -p ${dockerhubpwd}"    // double quotes for retrieving variable
                    }
                    bat 'docker push phongvo0222/devops-automation-integration'
                }
            }
        }
    }
}