#!/bin/bash
java -jar /opt/helloapi/helloapi.jar & echo $! > ./pid.file &