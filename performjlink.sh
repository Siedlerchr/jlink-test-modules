jlink --verbose \
--module-path \
%JAVA_HOME%\jmods:jlink-service-base\build\libs\jlink-service-base-0.0.1-SNAPSHOT.jar:jlink-app\build\libs\jlink-app-0.0.1-SNAPSHOT.jar:jlink-service-a\build\libs\jlink-service-a-0.0.1-SNAPSHOT.jar:jlink-service-b\build\libs\jlink-service-b-0.0.1-SNAPSHOT.jar \
--add-modules \
org.jdk.sample.jlink.test.app,org.jdk.sample.jlink.test.service,org.jdk.sample.jlink.test.service.b,org.jdk.sample.jlink.test.service.a \
--no-header-files \
--no-man-pages \
--strip-debug \
--compress=2 \
--launcher command=org.jdk.sample.jlink.test.app/org.jdk.sample.jlink.test.MainApplication \
--output target

#build\libs\bin\java -m org.jdk.sample.jlink.test.app/org.jdk.sample.jlink.testjlink

#build\libs\bin\command
