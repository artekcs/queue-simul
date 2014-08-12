name := "queue-simul"

version := "1.0"

scalaVersion := "2.11.2"

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.4"
)