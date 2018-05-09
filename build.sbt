import sbt.Keys._

name := "PlayStartApp"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  "org.mindrot" % "jbcrypt" % "0.3m",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.5.Final",
  "com.typesafe.play" %% "play-mailer" % "3.0.1",
  "commons-io" % "commons-io" % "2.4",
   "org.postgresql" % "postgresql" % "9.4-1200-jdbc41",
  "com.amazonaws" % "aws-java-sdk" % "1.3.11",
    filters
).map(_.exclude("org.slf4j", "slf4j-log4j12" ))

resolvers ++= Seq(
    "Apache" at "http://repo1.maven.org/maven2/",
    "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
    "Sonatype OSS Snasphots" at "http://oss.sonatype.org/content/repositories/snapshots"
)
routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(play.PlayJava, PlayEbean)

