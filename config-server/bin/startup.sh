#!/usr/bin/env bash
java -jar target/spring-cloud-config-server-1.0-SNAPSHOT.jar --spring.profiles.active=config1
java -jar target/spring-cloud-config-server-1.0-SNAPSHOT.jar --spring.profiles.active=config2
java -jar target/spring-cloud-config-server-1.0-SNAPSHOT.jar --spring.profiles.active=config3