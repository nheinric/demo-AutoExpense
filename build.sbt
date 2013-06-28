// Also see project/plugins.sbt

name := "ae"

version := "0.0.1"

scalaVersion := "2.10.0-RC2"

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// https://github.com/Gintellect/cucumberjvm-sbt/blob/master/build.sbt
libraryDependencies ++= Seq(
    "org.scalatest" % "scalatest_2.10.0-RC2" % "2.0.M5" % "test"
    , "com.novocode" % "junit-interface" % "0.9-RC2" % "test->default"
    , "info.cukes" % "cucumber-junit" % "1.1.1" % "test"
    , "info.cukes" % "cucumber-core" % "1.1.1" % "test"
    , "info.cukes" % "cucumber-scala" % "1.1.1" % "test"
    , "templemore" % "sbt-cucumber-integration_2.10" % "0.7.1" % "test"
    )

seq(cucumberSettings : _*)
