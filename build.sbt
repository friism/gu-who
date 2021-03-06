name := "gu-who"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.2"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  filters,
  ws,
  "org.webjars" % "bootstrap" % "3.2.0",
  "org.kohsuke" % "github-api" % "1.55",
  "com.github.nscala-time" %% "nscala-time" % "1.2.0",
  "com.squareup.okhttp" % "okhttp" % "2.0.0",
  "com.squareup.okhttp" % "okhttp-urlconnection" % "2.0.0",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3-1",
  "org.eclipse.jgit" % "org.eclipse.jgit" % "3.3.0.201403021825-r",
  "com.madgag.scala-git" %% "scala-git" % "2.4",
  "com.madgag.scala-git" %% "scala-git-test" % "2.4" % "test"
)     

sources in (Compile,doc) := Seq.empty

publishArtifact in (Compile, packageDoc) := false

