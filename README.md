# mailchimp-transactional-api-java

Java client for the Mailchimp Transactional API, generated at build time using [OpenAPI Generator](https://openapi-generator.tech).

- API version: 1.0.59
- Generator version: 7.20.0
- Spring Web: 7.0.4
- Jackson: 2.19.2

## Requirements

- Java 17+
- Gradle

## Building

```shell
./gradlew build
```

Source code is generated from `transactional.json` during the build using the `org.openapi.generator` Gradle plugin. No generated code is committed to the repository.

## Usage via JitPack

Add the JitPack repository and dependency to your build file:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.ErkoRisthein:mailchimp-transactional-api-java:TAG'
}
```
