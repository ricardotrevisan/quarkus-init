# code-with-quarkus Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```
Alternatively skipping tests:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar -Dmaven.test.skip
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)

# Referência

## Youtube
1. Vinicius Ferraz [https://www.youtube.com/watch?v=lSR5nyqE09c]
1. Github [https://github.com/viniciusfcf/semana-lives-quarkus.git]

## Centralizador de Log - Greylog | ElasticSearch
1. Plugin Logging GELF (extensão)
1. Stack Docker Compose (Disponível no Github)
    1. Greylog (streams)
    1. ElasticSearch
    1. MongoDB
1. Configuração da APP habilitando o GELF
    1. quarkus.log.handler.gelf.enabled=true
    1. quarkus.log.handler.gelf.host=localhost
    1. quarkus.log.handler.gelf.port=12201
1. Subir stack
    1. incrementar memória 
1. Criar Steam via UDP 
    1. referência em graylog-config.sh : curl -H ...
