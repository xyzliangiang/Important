Common.settings

libraryDependencies ++= Common.commons

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .aggregate(server,converter,commons)
  .dependsOn(server,converter,commons)

lazy val server = (project in file("modules/server")).enablePlugins(PlayJava)

lazy val converter = (project in file("modules/converter")).enablePlugins(PlayJava)

lazy val commons = (project in file("modules/commons")).enablePlugins(PlayJava)