plugins {
    id("java")
    id("application")
}

group = "ifpb"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.glassfish.jersey.containers:jersey-container-servlet-core:2.35")
    implementation("org.glassfish.jersey.inject:jersey-hk2:2.35")
    implementation("javax.ws.rs:javax.ws.rs-api:2.1")
    implementation("org.eclipse.jetty:jetty-server:9.4.44.v20210927")
    implementation("org.eclipse.jetty:jetty-servlet:9.4.44.v20210927")
    implementation("org.eclipse.jetty:jetty-webapp:9.4.44.v20210927")
}

application {
    mainClass.set("ifpb.Main")
}

tasks.jar {
    manifest {
        attributes(
                "Main-Class" to "ifpb.Main"
        )
    }
}

tasks.test {
    useJUnitPlatform()
}
