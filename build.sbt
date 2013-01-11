// Set the project name to the string 'My Project'
name := "jobScheduler"

// The := method used in Name and Version is one of two fundamental methods.
// The other method is <<=
// All other initialization methods are implemented in terms of these.
version := "1.0"

//Add Repository Path
//resolvers += "db4o-repo" at "http://source.db4o.com/maven"
//resolvers += "us.theatr" at "http://repo.theatr.us"

// Add a single dependency
//libraryDependencies += "junit" % "junit" % "4.8" % "test"

// add compile dependencies on some dispatch modules
//libraryDependencies ++= Seq(
//	"us.theatr" % "akka-quartz" % "0.1-SNAPSHOT"
//)