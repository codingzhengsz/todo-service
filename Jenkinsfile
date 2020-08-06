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
        bat 'gradle build'
      }
    }
    stage('deploy') {
      steps {
        echo 'deploy'
        bat "copy build\\libs\\*.jar d:\\deploy\\"
        bat "cd d:\\deploy && run.bat"
      }
    }
  }
}