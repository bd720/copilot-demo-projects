#add shebang
#!/bin/bash
#find other sonar process and kill it
jps -l | grep sonar | awk '{print $1}' | xargs kill -9
#find other spring boot process and kill it 
jps -l | grep demo-springboot-api | awk '{print $1}' | xargs kill -9
#find other maven process and kill it
jps -l | grep maven | awk '{print $1}' | xargs kill -9
