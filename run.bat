for /f "token=5" %%a in ('netstat -ano ^| findstr "8090" ^| findstr "LISTENING"') do set pid=%%a
if %pid% neq "" if %pid% neq "0" (taskkill /f /pid pid)