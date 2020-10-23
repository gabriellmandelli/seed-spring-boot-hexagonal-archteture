import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
	repositories {
		mavenCentral()
	}
}

plugins {
	id("org.springframework.boot") version "2.3.4.RELEASE"
	id("io.spring.dependency-management") version "1.0.10.RELEASE"
	kotlin("jvm") version "1.3.72"
	kotlin("plugin.spring") version "1.3.72"
	kotlin("plugin.jpa") version "1.3.72"
}

allprojects {
	group = "com.greentower"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "11"
		}
//		dependencies {
//			implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//			runtimeOnly("org.postgresql:postgresql")
//			developmentOnly("org.springframework.boot:spring-boot-devtools")
//			testImplementation("org.springframework.boot:spring-boot-starter-test") {
//				exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
//			}
//		}
	}
}

subprojects {
	repositories {
		mavenCentral()
	}

	apply {
		plugin("io.spring.dependency-management")
	}
}