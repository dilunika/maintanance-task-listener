#!/bin/bash

java -cp hsqldb.jar org.hsqldb.server.Server --database.0 file:maintdb-tablespace --dbname.0 maintdb

echo "Maintanace Notification System DB started ..."