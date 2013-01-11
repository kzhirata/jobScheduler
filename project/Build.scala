import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "jobScheduler"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
//about mybatis
      "org.mybatis.scala" % "mybatis-scala-core" % "1.0-beta1",
//about quarts
      "org.quartz-scheduler" % "quartz"        % "2.1.5",
      "org.specs2"        %% "specs2"          % "1.11",
      "ch.qos.logback"    %  "logback-classic" % "1.0.0",
      "org.slf4j"         %  "slf4j-api"       % "1.6.4"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here
    )

}
