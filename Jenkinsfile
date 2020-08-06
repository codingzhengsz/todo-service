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
        bat '''cd d:\\deploy
               for /f "token=5" %%a in ('netstat -ano ^| findstr "8090" ^| findstr "LISTENING"') do set pid=%%a
               if %pid% neq "" if %pid% neq "0" (taskkill /f /pid pid)
            '''
        bat 'start javar -jar d:\\deploy\\todo-list-0.0.1-SNAPSHOT.jar'

      }
    }
  }
}