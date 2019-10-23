# Archetypes for Vaadin 10+

*The missing Vaadin 10+ archetypes*

The project contains three basic archetypes for Vaadin 10+ (aka Flow).

## Plain servlet

Create project with following command (or use these coordinates from your IDE):

```
mvn archetype:generate  \
    -DarchetypeGroupId=in.virit  \
    -DarchetypeArtifactId=viritin-vaadin-flow-archetype  \
    -DarchetypeVersion=1.1
```

## CDI (Java EE) version

Create project with following command (or use these coordinates from your IDE):

```
mvn archetype:generate  \
    -DarchetypeGroupId=in.virit  \
    -DarchetypeArtifactId=viritin-vaadin-flow-cdi-archetype  \
    -DarchetypeVersion=1.1 \
```

## Spring servlet
    
Create project with following command (or use these coordinates from your IDE):

```
mvn archetype:generate  \
    -DarchetypeGroupId=in.virit  \
    -DarchetypeArtifactId=viritin-vaadin-flow-spring-archetype  \
    -DarchetypeVersion=1.1
```

## 14.1 pre-release version

```
mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate  \
    -DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots/  \
    -DarchetypeGroupId=in.virit  \
    -DarchetypeArtifactId=viritin-vaadin-flow-archetype  \
    -DarchetypeVersion=1.2-SNAPSHOT
```
