import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "jobScheduler21"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
       jdbc,
//about mybatis
      "org.mybatis.scala" % "mybatis-scala-core_2.10" % "1.0.1",
//about quarts
      "org.quartz-scheduler" % "quartz"        % "2.1.5",
      "org.specs2"        %% "specs2"          % "1.11",
      "ch.qos.logback"    %  "logback-classic" % "1.0.0",
      "org.slf4j"         %  "slf4j-api"       % "1.6.4"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
