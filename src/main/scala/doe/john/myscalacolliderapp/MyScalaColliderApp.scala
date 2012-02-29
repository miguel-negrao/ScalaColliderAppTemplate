package doe.john.myscalacolliderapp

import de.sciss.synth._
import ugen._
import java.io.File

object MyScalaColliderApp {

  def main(args: Array[String]) {

    val cfg = Server.Config()
    cfg.programPath = (new File( "Contents/Resources/scsynth" ).getAbsolutePath).toString
    // runs a server and executes the function
    // when the server is booted, with the
    // server as its argument
    println("Starting scsynth.")
    Server.run( cfg ) { s =>
    println("scsynth started")  
    // play is imported from package de.sciss.synth.
    // it provides a convenience method for wrapping
    // a synth graph function in an `Out` element
    // and playing it back.
      play {
        val f = LFSaw.kr( 0.4 ).madd( 24, LFSaw.kr( Seq( 8, 7.23 )).madd( 3, 80 )).midicps
        CombN.ar( SinOsc.ar( f ) * 0.04, 0.2, 0.2, 4 )
      }
      println("sound played.")
    }

  }

}