import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.2.10"
    id("fabric-loom") version "1.11-SNAPSHOT"
    id("maven-publish")
}

version = project.property("mod_version") as String
group = project.property("maven_group") as String

base {
    archivesName.set(project.property("archives_base_name") as String)
}

val targetJavaVersion = 21
java {
    toolchain.languageVersion = JavaLanguageVersion.of(targetJavaVersion)
    // Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the "build" task
    // if it is present.
    // If you remove this line, sources will not be generated.
    withSourcesJar()
}

loom {
    splitEnvironmentSourceSets()

    mods {
        register("pear_expansion") {
            sourceSet("main")
            sourceSet("client")
        }
    }
}

fabricApi {
    configureDataGeneration {
        client = true
    }
}

repositories {
    // Add repositories to retrieve artifacts from in here.
    // You should only use this when depending on other mods because
    // Loom adds the essential maven repositories to download Minecraft and libraries from automatically.
    // See https://docs.gradle.org/current/userguide/declaring_repositories.html
    // for more information about repositories.
    maven("https://maven.ladysnake.org/releases")
    mavenCentral()
    exclusiveContent {
        forRepository {
            maven {
                name = "Modrinth"
                url = uri("https://api.modrinth.com/maven")
            }
        }
        filter {
            includeGroup("maven.modrinth")
        }
    }
}

dependencies {
    // To change the versions see the gradle.properties file
    minecraft("com.mojang:minecraft:${project.property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${project.property("yarn_mappings")}:v2")
    modImplementation("net.fabricmc:fabric-loader:${project.property("loader_version")}")
    modImplementation("net.fabricmc:fabric-language-kotlin:${project.property("kotlin_loader_version")}")

    modImplementation("net.fabricmc.fabric-api:fabric-api:${project.property("fabric_version")}")
    modImplementation("maven.modrinth:trinkets-canary:${project.property("trinkets_version")}")
    modImplementation("org.ladysnake.cardinal-components-api:cardinal-components-base:${project.property("cardinal_components_version")}")
    modImplementation("org.ladysnake.cardinal-components-api:cardinal-components-entity:${project.property("cardinal_components_version")}")
}

val modVersion: String = project.version.toString()
val mcVersion: String = project.property("minecraft_version").toString()
val loaderVersion: String = project.property("loader_version").toString()
val kotlinLoaderVersion: String = project.property("kotlin_loader_version").toString()
val trinketsVersion: String = project.property("trinkets_version").toString()
val cardinalComponentsVersion: String = project.property("cardinal_components_version").toString()

tasks.processResources {
    inputs.property("version", modVersion)
    inputs.property("minecraft_version", mcVersion)
    inputs.property("loader_version", loaderVersion)
    inputs.property("kotlin_loader_version", kotlinLoaderVersion)
    inputs.property("trinkets_version", trinketsVersion)
    inputs.property("cardinal_components_version", cardinalComponentsVersion)

    filteringCharset = "UTF-8"

    filesMatching("fabric.mod.json") {
        expand(
            "version" to modVersion,
            "minecraft_version" to mcVersion,
            "loader_version" to loaderVersion,
            "kotlin_loader_version" to kotlinLoaderVersion,
            "trinkets_version" to trinketsVersion,
            "cardinal_components_version" to cardinalComponentsVersion
        )
    }
}

tasks.withType<JavaCompile>().configureEach {
    // ensure that the encoding is set to UTF-8, no matter what the system default is
    // this fixes some edge cases with special characters not displaying correctly
    // see http://yodaconditions.net/blog/fix-for-java-file-encoding-problems-with-gradle.html
    // If Javadoc is generated, this must be specified in that task too.
    options.encoding = "UTF-8"
    options.release.set(targetJavaVersion)
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions.jvmTarget.set(JvmTarget.fromTarget(targetJavaVersion.toString()))
}

tasks.jar {
    from("LICENSE") {
        rename { "${it}_${project.base.archivesName}" }
    }
}

// configure the maven publication
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = project.property("archives_base_name") as String
            from(components["java"])
        }
    }

    // See https://docs.gradle.org/current/userguide/publishing_maven.html for information on how to set up publishing.
    repositories {
        // Add repositories to publish to here.
        // Notice: This block does NOT have the same function as the block in the top level.
        // The repositories here will be used for publishing your artifact, not for
        // retrieving dependencies.
    }
}
