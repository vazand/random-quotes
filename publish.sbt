ThisBuild / organization := "io.github.vazand"
ThisBuild / organizationName := "vazand"
ThisBuild / organizationHomepage := Some(url("https://vazand.github.io"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/vazand/random-quotes"),
    "scm:git@github.com:vazand/random-quotes.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id    = "vazand",
    name  = "Vasanth K",
    email = "vazandvel@gmail.com.com",
    url   = url("https://vazand.github.io")
  )
)

ThisBuild / description := "this is a quotes project to get positive vibes daily..."
ThisBuild / licenses := List("The Unlicense" -> new URL("https://unlicense.org/"))
ThisBuild / homepage := Some(url("https://github.com/vazand/random-quotes"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }

ThisBuild / publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

ThisBuild / publishMavenStyle := true

ThisBuild / versionScheme := Some("early-semver")