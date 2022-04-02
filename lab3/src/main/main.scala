import utils._
object Appl {
  def main(args: Array[String]) {
    val passwdLen = 12
    val inFile = scala.io.Source.fromFile("logins.txt")
    val outFile = new java.io.PrintWriter("login-passwds.txt")

    try {
      for(login <- inFile.getLines()){
        val passwd = PasswdGen.nextPassword(passwdLen)
        outFile.println(login + ":" + passwd)
        println(login + ":" + passwd)
      }
    }
    catch {
      case ex: Throwable =>
        println(ex.getMessage)
    }
    finally {
      inFile.close()
      outFile.close()
    }
  }

}





