import sbt._
import Keys._
import play.sbt.PlayImport.guice

object Common {
  val settings: Seq[Setting[_]] = Seq(
    name := """HyperGraph""",
    organization := "hk.onebit",
    version := "1.2-SNAPSHOT"
  )
  
  val commons = Seq(
    guice,
    "org.apache.logging.log4j" % "log4j-core" % "2.11.1",
    "log4j" % "log4j" % "1.2.17"
  )
}