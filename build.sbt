name := "slickless"
organization := "com.mosaicpower"
version := "0.4.0-SNAPSHOT"

scalaVersion := "2.13.15"
crossScalaVersions := Seq("2.12.20", "2.13.15")

licenses += ("Apache-2.0", url("http://apache.org/licenses/LICENSE-2.0"))

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-Ywarn-dead-code",
  "-Xlint",
  "-Xfatal-warnings"
)

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.5.1",
  "com.chuusai" %% "shapeless" % "2.3.12",
  "org.scalatest" %% "scalatest" % "3.2.19" % Test,
  "com.h2database" % "h2" % "2.3.232" % Test,
  "ch.qos.logback" % "logback-classic" % "1.5.12" % Test
)

pomExtra in Global := {
  <url>https://github.com/mosaicpower/slickless</url>
    <scm>
      <connection>scm:git:github.com/mosaicpower/slickless</connection>
      <developerConnection>scm:git:git@github.com:mosaicpower/slickless</developerConnection>
      <url>github.com/mosaicpower/slickless</url>
    </scm>
    <developers>
      <developer>
        <id>d6y</id>
        <name>Richard Dallaway</name>
        <url>http://twitter.com/d6y</url>
      </developer>
      <developer>
        <id>davegurnell</id>
        <name>Dave Gurnell</name>
        <url>http://twitter.com/davegurnell</url>
      </developer>
      <developer>
        <id>milessabin</id>
        <name>Miles Sabin</name>
        <url>http://twitter.com/milessabin</url>
      </developer>
    </developers>
}

