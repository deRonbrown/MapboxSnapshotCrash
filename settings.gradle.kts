pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication { create<BasicAuthentication>("basic") }
            credentials {
                settings.withGroovyBuilder {
                    username = "mapbox"
                    password = getProperty("MAPBOX_DOWNLOADS_TOKEN")?.toString() ?: System.getenv("MAPBOX_DOWNLOADS_TOKEN")
                }
            }
        }
    }
}

rootProject.name = "MapboxSnapshotCrash"
include(":app")
