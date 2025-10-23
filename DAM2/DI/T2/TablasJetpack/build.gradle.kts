plugins {
    kotlin("jvm") version "1.9.10"
    id("org.jetbrains.compose") version "1.5.0"
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "MainKt" // Cambia si tu Main.kt tiene paquete
    }
}

kotlin {
    jvmToolchain(17) // Java 17 recomendado
}
