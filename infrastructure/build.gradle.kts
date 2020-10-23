plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

group = "com.greentower.hexagonal.infrastructure"

dependencies { implementation(project(":domain")) }