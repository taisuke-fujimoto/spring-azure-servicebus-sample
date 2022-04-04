plugins {
    id("org.springframework.boot") version "2.6.6"
    kotlin("jvm") version "1.6.20"
    kotlin("plugin.spring") version "1.6.20"
}

apply(plugin = "io.spring.dependency-management")

tasks.wrapper {
    gradleVersion = "7.4.2"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.azure.spring:spring-cloud-azure-starter-integration-servicebus:4.0.0")
}
