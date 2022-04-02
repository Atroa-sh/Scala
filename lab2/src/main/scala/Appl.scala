import Int2DVec.unitVectorOf

object Appl extends App{


  val janek = new Person("1234567890" , "Jan", "Kowalski")
  /*println(janek.getName())
  //println(janek.id)
  janek.surname = "Kowal"
  println(janek.getName())*/



  val v1 = Int2DVec(1, 2)
  val v2 = Int2DVec(10, 20)
  val v3 = v1 + v2
  val v4 = -v2
  println(v3)
  println(v4)
  println(Int2DVec())
  println(Int2DVec(v1 + v1 + v2))
  //obiekty towarzyszace maja dostep do prywatnych pól w klasie ktorej towarzysza
  print(unitVectorOf(v4))
}
