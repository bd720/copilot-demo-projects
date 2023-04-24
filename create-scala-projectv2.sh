#!/bin/bash
# create a scala project 'bigdata-demo-rw' using maven plugin
# create a scala project 'bigdata-demo-rw' using maven plugin
mvn archetype:generate -DgroupId=com.bigdata.demo -DartifactId=bigdata-demo-rw -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
# add scala dependencies to pom.xml 
