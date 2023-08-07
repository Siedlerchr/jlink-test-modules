jlink --module-path ^
%JAVA_HOME%\jmods;^
out;^
--add-modules ^
jlink.sample.app,^
jlink.sample.service,^
jlink.sample.service.b,^
jlink.sample.service.a ^
--no-header-files ^
--no-man-pages ^
--strip-debug ^
--compress=2 ^
--launcher command=jlink.sample.sampleapp/jlink.sample.sampleapp.MainApplication ^
--output target

REM build\libs\bin\java -m jlink.sampleapp/jlink.samplejlink

