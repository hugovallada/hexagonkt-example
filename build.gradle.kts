plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.github.hugovallada"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.hexagonkt:http_server_jetty:3.4.3")
    testImplementation(kotlin("test"))

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}