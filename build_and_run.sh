#!/usr/bin/env bash

mvn clean package -DskipTests
java -Dvertx.logger-delegate-factory-class-name=io.vertx.core.logging.SLF4JLogDelegateFactory -Dhttp-port=8282 -jar target/vertx-postgresql-maven-1.0.0-SNAPSHOT-fat.jar
