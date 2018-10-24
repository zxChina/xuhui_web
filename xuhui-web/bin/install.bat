cd ..
call mvn install -Dmaven.test.skip

set "pabuf=C:\zhouxu\worspace-lc-web\workspace-ruhnn-ziyong\xuhui-web\xuhui-web-controller\target\xuhui-web-controller-0.0.1-SNAPSHOT.war"
set "tobuf=C:\zhouxu\apache-tomcat-7.0.63\webapps\xuhui.war"
set "path=C:\zhouxu\apache-tomcat-7.0.63\webapps\xuhui"
copy /y "%pabuf%" "%tobuf%" 
echo 复制完成! 

if exist %path% goto deleteFile 
goto start 

:deleteFile
rd /s /q %path%

echo 删除成功!

:start
echo 开始启动tomcat
cd C:\zhouxu\apache-tomcat-7.0.63\bin
call shutdown.bat
call startup.bat


@pause