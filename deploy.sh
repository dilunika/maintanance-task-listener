#!/bin/bash

mvn clean install

cp -rf target/*.jar /opt/programs/karaf/deploy

echo "Deployed to Karaf ...."
