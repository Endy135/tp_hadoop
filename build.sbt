ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.5"

lazy val root = (project in file("."))
  .settings(
    name := "tp_hadoop"
  )
val sparkVersion = "3.2.4"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)