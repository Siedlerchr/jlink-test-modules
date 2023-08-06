#!/bin/sh
java \
--module-path \
jlink-service-base/build/libs/jlink-service-base-0.0.1-SNAPSHOT.jar:\
jlink-app/build/libs/jlink-app-0.0.1-SNAPSHOT.jar:\
jlink-service-a/build/libs/jlink-service-a-0.0.1-SNAPSHOT.jar:\
jlink-service-b/build/libs/jlink-service-b-0.0.1-SNAPSHOT.jar \
-m \
org.jdk.sample.jlink.test.app/org.jdk.sample.jlink.test.MainApplication
