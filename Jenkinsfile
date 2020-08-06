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
        bat "run.bat"
        bat 'start java -jar d:\\deploy\\todo-list-0.0.1-SNAPSHOT.jar'

      }
    }
  }
}