REM @ECHO OFF
PowerShell.exe -Command "& 'C:\Users\Jefferson Moura\OneDrive - Inmetrics\ponto\ponto.ps1'"
setlocal
SLEEP 60
Taskkill /im iexplorer.exe
Output
EXIT /B