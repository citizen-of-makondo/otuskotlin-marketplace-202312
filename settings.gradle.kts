pluginManagement {
    val kotlinVersion: String by settings
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "otuskotlin-marketplace-202312"
include("m1l1-first")
