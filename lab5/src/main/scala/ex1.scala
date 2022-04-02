class Pred extends Function1[Int , Int] {
  override def apply(a:Int) = a + 1
}
class NumOps {
  def succ(a: Int) = a + 1
  def pred(a: Int) = a - 1
  def maxFrom3(d1: Double, d2: Double, d3: Double): Double = {
    if(d1>=d2 && d1>=d3) d1
    else if(d2>=d1 && d2>= d3) d2
    else d3
  }
}

class MaxFrom3 extends Function3[Double , Double , Double , Double]{
  override def apply(d1: Double, d2: Double, d3: Double): Double = {
    if(d1>=d2 && d1>=d3) d1
    else if(d2>=d1 && d2>= d3) d2
    else d3
  }
}

object Appl{
  def main(args: Array[String]): Unit = {
    val max = new MaxFrom3
    val expected1 = 3.0
    val received1 = max(1.0,2.0,3.0)
    if(expected1==received1){
      println("Received: " + received1 + " Expected: " + expected1 + " test passed")
    }
    else println("Received: " + received1 + " Expected: " + expected1 + " test failed")

    val expected2 = 20.0
    val received2 = max(20.0,20.0,20.0)
    if(expected2==received2){
      println("Received: " + received2 + " Expected: " + expected2 + " test passed")
    }
    else println("Received: " + received2 + " Expected: " + expected2 + " test failed")
  }
}