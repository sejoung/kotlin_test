import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
    id("org.jlleitschuh.gradle.ktlint-idea") version "10.0.0"
    id("com.google.devtools.ksp") version "1.7.10-1.0.6" apply false
}

group = "io.github.sejoung"
version = "1.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.devtools.ksp:symbol-processing-api:1.7.10-1.0.6")
    implementation("com.squareup:kotlinpoet:1.11.0")
    implementation("com.squareup:kotlinpoet-ksp:1.12.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}