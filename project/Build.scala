import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-admin"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
  )
  
  val adminDeps = Seq(
      // Add your project dependencies here,
      "mysql" % "mysql-connector-java" % "5.1.18",
      jdbc,
      anorm
    )
  
  val adminModule = play.Project(
    "admin", appVersion, adminDeps, path = file("play-admin")
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  ).dependsOn(adminModule)
}
