plugins {
    id("java")
    id("info.solidsoft.pitest") version "1.15.0"
}

pitest {
    //excludedMethods - did not help
    excludedMethods.set(listOf("givenIntegersWithMaximumArraySize_whenGetRandomArrayWithBounds_thenReturnIntegersFromLowerToUpperBoundsWithCertainLength"))
    //adds dependency to org.pitest:pitest-junit5-plugin and sets "testPlugin" to "junit5"
    junit5PluginVersion = "1.0.0"    //or 0.15 for PIT <1.9.0
    // ...

}

group = "org.twentymethods"
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

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}