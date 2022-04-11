pipeline {
  agent any
  tools {
    maven 'Maven'
    jdk 'Java'
  }
  stages {
    stage('Compile') {
        steps {
            sh "mvn package spring-boot:repackage"
        }
    }
    stage('Build') {
        steps {
            sh "docker build -t example-service-time ."
        }
    }
    stage('Run') {
        steps {
            sh "docker run -d -P example-service-time"
        }
    }
  }
}