seq(appbundle.settings: _*)

name           := "MyScalaColliderApp"

version        := "0.1"

organization   := "doe.john"

scalaVersion   := "2.9.1"

libraryDependencies ++= Seq(
   "de.sciss" %% "scalacollider" % "0.31"
)

//retrieveManaged := true

scalacOptions ++= Seq( "-deprecation", "-unchecked" )

// ---- packaging ----

appbundle.name := "MyScalaColliderApp"

appbundle.javaOptions += "-Xmx1024m"

appbundle.javaOptions ++= Seq( "-ea" )

appbundle.systemProperties += "SC_HOME" -> "Contents/Resources/scsynth"

appbundle.resources += file( "scsynth/build/Install/SuperCollider/scsynth" )

appbundle.resources += file( "scsynth/build/Install/SuperCollider/plugins" )

appbundle.resources += file( "scsynth/build/Install/SuperCollider/libscsynth.1.0.0.dylib" )

appbundle.resources += file( "scsynth/build/Install/SuperCollider/libscsynth.1.dylib" )

appbundle.resources += file( "scsynth/build/Install/SuperCollider/libscsynth.dylib" )

appbundle.workingDirectory := Some( file( appbundle.BundleVar_AppPackage ))