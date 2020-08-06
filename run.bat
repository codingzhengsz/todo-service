for /f "tokens=5" %%a in ('netstat -ano ^| findstr "8090" ^| findstr "LISTENING"') do taskkill /f /pid %%a
