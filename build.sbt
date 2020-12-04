name := "KafkaDream"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies ++= Seq (
  "org.apache.kafka" % "kafka-clients" % "2.6.0",
  "org.slf4j" % "slf4j-log4j12" % "1.7.30",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.12.0"
)