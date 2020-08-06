pipeline {
  agent { label 'master' }
  stages {
    stage('test') {
      steps {
        echo 'test'
        bat 'gradle test'
      }
    }
    stage('build') {
      steps {
        echo 'build'
      }
    }
    stage('deploy') {
      steps {
        echo 'deploy'
      }
    }
  }
}