rm -rf target
jlink --verbose \
--module-path \
%JAVA_HOME%\jmods:out \
--add-modules \
jlink.sample.sampleapp,jlink.sample.service.base,jlink.sample.service.b,jlink.sample.service.a \
--no-header-files \
--no-man-pages \
--strip-debug \
--compress=2 \
--launcher command=jlink.sample.sampleapp/jlink.sample.sampleapp.MainApplication \
--output target

#build\libs\bin\java -m jlink.sample.app/jlink.samplejlink

#build\libs\bin\command
