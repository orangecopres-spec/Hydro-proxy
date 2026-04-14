plugins {
    java
    application
}

group = "com.hydroproxy"
version = "1.0.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.netty:netty-all:4.1.111.Final")
}

application {
    mainClass.set("com.hydroproxy.HydroProxy")
}

