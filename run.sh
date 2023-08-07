#!/bin/sh
javac -d out --module-source-path "./*/src/main/java/" $(find . -name "*.java")
java \
--module-path out \
-m \
jlink.sample.sampleapp/jlink.sample.sampleapp.MainApplication
