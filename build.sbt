name := "berlin-clock"

version := "1.0"

scalaVersion := "2.12.2"

mainClass in Compile := Some("uk.co.benparker.berlinclock.BerlinClockApp")

libraryDependencies += "org.specs2" %% "specs2-core" % "3.9.1" % "test"

libraryDependencies += "org.specs2" %% "specs2-mock" % "3.9.1" % "test"

libraryDependencies += "org.specs2" %% "specs2-matcher" % "3.9.1" % "test"
