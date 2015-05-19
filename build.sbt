name := """akka-sample-remote-scala"""

version := "2.3.9"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-remote" % "2.3.9",
  "com.typesafe.akka" %% "akka-zeromq" % "2.3.10",
  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-M5",
  "com.typesafe.akka" %% "akka-http-core-experimental" % "1.0-M5",
  "com.typesafe.akka" %% "akka-http-scala-experimental" % "1.0-RC2",
  "org.zeromq" % "zeromq-scala-binding_2.10" % "0.0.7"
)

fork in run := true