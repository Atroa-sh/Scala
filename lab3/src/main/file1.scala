package utils{
  object PasswdGen{
    val allowedChars = (('0' to '9') ++
      ('A' to 'Z') ++
      ('a' to 'z')).toArray ++
      Array('-', '.', '_')
    val nrOfAllowed = allowedChars.length
    def nextChar():Char ={
      allowedChars(util.Random.nextInt(allowedChars.length))
    }
    def nextPassword(len:Int):String = {
      var passAcc = new StringBuilder(len)
      for(_ <- 0 to len){
        passAcc +=nextChar()
      }
      passAcc.toString()
    }

  }
}




package p1 {
  class C1 {
    println("C1")
    def m1C1() { println("m1C1()") }
  }
  package p2 {
    class C21 { println("C21") }
    class C22 { println("C22") }
    class C23 { println("C23") }
    object C2 {
      def m1OC2() { println("m1OC2") }
      def m2OC2(c1: C1) {
        import c1._
        println("m2OC2")
        m1C1()
      }
    }
  }
}

/*
kod na poczatku nie skapilowal ise bo C22 i C23 byly zaimportowane pod konkretnymi nazwami
kod z worzenia nowych klass wywalal sie przed mainem

 */