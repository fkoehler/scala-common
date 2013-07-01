import sbt._
import sbt.Keys._

object ScalaCommonBuild extends Build {
  lazy val scCommon = Project(
    id = "scala-common",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "scala common",
      organization := "com.github.scalacommon",
      version := "0.1",
      scalaVersion := "2.10.1",
      libraryDependencies ++= Seq(
      ),
      publishTo <<= version {
        (v: String) =>
          val base = "/Users/fab/dev/fkoehler-mvn-repo"
          if (v.trim.endsWith("SNAPSHOT"))
            Some(Resolver.file("file", new File(base + "/snapshots")))
          else
            Some(Resolver.file("file", new File(base + "/releases")))
      }
    )
  )
}
