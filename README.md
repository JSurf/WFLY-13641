# WFLY-13641

Sample Project for
https://issues.redhat.com/browse/WFLY-13641

1. Build ear
 
```
cd ear
mvn install
cd ..
```

2. Build war

```
cd war
mvn install
```

3. Download wildfly zip, unpack
4. copy ear/ear/target/myear.ear to wildfly standalone/deployments
5. copy war/target/mywar.war to wildfly standalone/deployments
6. Start wildfly with standalone.bat or standalone.sh

 
