# Archetypes for Vaadin 10+

*The missing Vaadin 10+ archetypes*

The project contains three basic archetypes for Vaadin 10+ (aka Flow).

## Plain servlet

Create project with following command:

```
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate  \
    -DarchetypeGroupId=in.virit  \
    -DarchetypeArtifactId=viritin-vaadin-flow-archetype  \
    -DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots/  \
    -DarchetypeVersion=1.0-SNAPSHOT
```

## CDI (Java EE) version

Create project with following command:

```
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate  \
    -DarchetypeGroupId=in.virit  \
    -DarchetypeArtifactId=viritin-vaadin-flow-cdi-archetype  \
    -DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots/  \
    -DarchetypeVersion=1.0-SNAPSHOT
```


## Spring servlet
    
Create project with following command:

```
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate  \
    -DarchetypeGroupId=in.virit  \
    -DarchetypeArtifactId=viritin-vaadin-flow-spring-archetype  \
    -DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots/  \
    -DarchetypeVersion=1.0-SNAPSHOT
```

