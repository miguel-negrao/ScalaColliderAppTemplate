package doe.john.myscalacolliderapp

import de.sciss.synth._
import ugen._
import java.io.File

object MyScalaColliderApp extends App with Runnable {
  java.awt.EventQueue.invokeLater(this)

  def run() {
    val f = new javax.swing.JFrame("ScalaCollider")
    val lb = new javax.swing.JLabel("Booting...")
    f.getContentPane().add(lb, java.awt.BorderLayout.CENTER)
    f.setSize(250,50)
    f.setResizable(false)
    f.setLocationRelativeTo(null)
    f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)
    f.setVisible(true)

    val cfg = Server.Config()
    cfg.programPath = (new File( "Contents/Resources/scsynth" ).getAbsolutePath).toString
    // runs a server and executes the function
    // when the server is booted, with the
    // server as its argument
    println("Starting scsynth.")
    Server.run( cfg ) { s =>
      lb.setText("scsynth started")  
      play {
        val f = LFSaw.kr( 0.4 ).madd( 24, LFSaw.kr( Seq( 8, 7.23 )).madd( 3, 80 )).midicps
        CombN.ar( SinOsc.ar( f ) * 0.04, 0.2, 0.2, 4 )
      }
    }
  }
}
