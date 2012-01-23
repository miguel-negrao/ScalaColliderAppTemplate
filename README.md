## ScalaCollider Template App

### statement

MyScalaColliderApp is (C)opyright by 2011-2012 John Doe. All rights reserved. It is released under the GNU General Public License. 

This is a template to make a ScalaCollider based OSX app. 

- Add your own code.
- run appbundle to repackage the app.
- Change the Info.plist to reflect the name of your classes and add the jar files that 'appbundle' copied to inside the bundle.


### requirements / installation

Builds with sbt 0.11 and compiles against Scala 2.9.1 and Java 1.6. Depends on ScalaCollider.

### creating an IntelliJ IDEA project

If you haven't globally installed the sbt-idea plugin yet, create the following contents in `~/.sbt/plugins/build.sbt`:

    resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
    
    addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "0.11.0")

Then to create the IDEA project, run the following two commands from the xsbt shell:

    > set ideaProjectName := "MyScalaColliderApp"
    > gen-idea

### download

The current version can be downloaded from [github.com/Sciss/LeereNull](http://github.com/...).

