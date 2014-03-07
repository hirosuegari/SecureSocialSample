import play.Project._

name := "SampleM2"

version := "1.0"

resolvers += Resolver.url("sbt-plugin-releases", url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  "ws.securesocial" %% "securesocial" % "2.1.3"
)

playScalaSettings