object ex2 {
  def main(args: Array[String]): Unit = {
    val pred = (a: Int) => a-1
    val maxFrom3 = (d1: Double , d2: Double , d3: Double) => if(d1>=d2 && d1>=d3) d1 else if (d2>=d1 && d2>=d3) d2 else d3
    println(pred(5))
    println(maxFrom3(2,5,1))
  }
}
