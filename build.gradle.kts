plugins {
    id("java")
    id("application")
}

group = "com.charchalis.hero"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("Application")
}

dependencies {
    implementation("com.googlecode.lanterna:lanterna:3.1.1")
}