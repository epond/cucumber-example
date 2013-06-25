name := "Cucumber Scala Example"

version := "1.0"

scalaVersion := "2.10.0"

resolvers += "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
    "net.databinder.dispatch" % "dispatch-core_2.10" % "0.9.4",
    "com.novocode" % "junit-interface" % "0.9" % "test->default",
    "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
    "info.cukes" % "cucumber-junit" % "1.1.2",
    "info.cukes" % "cucumber-scala" % "1.1.2",
    "junit" % "junit" % "4.10" % "test",
    "org.scala-lang" % "scala-actors" % "2.10.0",
    "org.slf4j" % "slf4j-simple" % "1.6.6",
	"org.scalaz" %% "scalaz-core" % "7.0.0",
	"joda-time" % "joda-time" % "2.1",
	"org.joda" % "joda-convert" % "1.2",
    "io.argonaut" % "argonaut_2.10" % "6.0-RC1"
)

initialCommands in console := "import scalaz._, Scalaz._, argonaut._, Argonaut._"
