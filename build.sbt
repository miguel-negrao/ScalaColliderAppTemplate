import AssemblyKeys._

name           := "MyScalaColliderApp"

appbundleName  := "MyScalaColliderApp"

version        := "0.1"

organization   := "doe.john"

scalaVersion   := "2.9.1"

libraryDependencies ++= Seq(
   "de.sciss" %% "scalacollider" % "0.31"
)

//retrieveManaged := true

scalacOptions ++= Seq( "-deprecation", "-unchecked" )

// ---- packaging ----

seq( assemblySettings: _* )

test in assembly := {}

seq( appbundleSettings: _* )
