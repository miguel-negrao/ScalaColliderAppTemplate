package doe.john.myscalacolliderapp

/**
 * Created by IntelliJ IDEA.
 * User: miguelnegrao
 * Date: 23/01/12
 * Time: 22:30
 * To change this template use File | Settings | File Templates.
 */

import de.sciss.synth._
import ugen._

object MyScalaColliderApp {

  def main(args: Array[String]) {

    val cfg = Server.Config()
    cfg.programPath = "/Users/miguelnegrao/Development/SuperCollider/scgit/supercollider/build/Install/SuperCollider/scsynth"
    // runs a server and executes the function
    // when the server is booted, with the
    // server as its argument
    Server.run( cfg ) { s =>
    // play is imported from package de.sciss.synth.
    // it provides a convenience method for wrapping
    // a synth graph function in an `Out` element
    // and playing it back.
      play {
        val f = LFSaw.kr( 0.4 ).madd( 24, LFSaw.kr( Seq( 8, 7.23 )).madd( 3, 80 )).midicps
        CombN.ar( SinOsc.ar( f ) * 0.04, 0.2, 0.2, 4 )
      }
    }

  }

}