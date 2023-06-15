File log = new File(basedir, 'build.log')
assert log.exists()
assert log.text.contains("OpenAPI Generator: java-micronaut-client (client)")
assert log.text.contains("BUILD SUCCESS")

new File(basedir, "target/generated-sources/openapi/src/main/java/io/micronaut/openapi/api/PetApi.java").exists()
new File(basedir, "target/generated-sources/openapi/src/main/java/io/micronaut/openapi/model/Pet.java").exists()
new File(basedir, "target/classes/io/micronaut/openapi/api/PetApi.class").exists()
new File(basedir, "target/classes/io/micronaut/openapi/model/Pet.class").exists()
