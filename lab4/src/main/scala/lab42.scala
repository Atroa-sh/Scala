object lab42 {

}
import scala.math.pow

object Appl42 {
  import scala.annotation.tailrec
  def sumArrayRec1(i: Int, elems: Array[Int]): Int = {
    if (i < elems.size) elems(i) + sumArrayRec1(i + 1, elems)
    else 0
  }
  def sumArrayRec2(elems: Array[Int]) = {
    val size = elems.size
    def goFrom(i: Int): Int = {
      if (i < size) elems(i) + goFrom(i+1)
      else 0
    }
    goFrom(0)
  }
  def checkPredicate(pred: Boolean,
                     predAsString: String,
                     prefix: String = "Checking if ") {
    if (pred) println(prefix + predAsString + ": OK")
    else println(prefix + predAsString + ": Fail")
  }
  def sumArrayIter(elems: Array[Int]) = {
    var sum = 0
    for (i <- elems) sum += i
    sum
  }
  def sumSqrArrayRec1(i: Int, elems: Array[Int]): Int = {
    if (i < elems.size) pow(elems(i),2).toInt + sumSqrArrayRec1(i + 1, elems)
    else 0
  }
  def sumSqrArrayRec2(elems: Array[Int]):Int = {
    val size = elems.size
    def goFrom(i: Int): Int = {
      if (i < size) pow(elems(i),2).toInt + goFrom(i+1)
      else 0
    }
    goFrom(0)
  }
  def sumSqrArrayIter(elems: Array[Int]):Int = {
    var sum = 0
    for(i <- elems) sum+=pow(i,2).toInt
    sum
  }

  def sumSqrArrayRec3(elems: Array[Int]) = {
    @tailrec
    def goFrom(i: Int,
               size: Int,
               elms: Array[Int],
               acc: Int): Int = {
      if (i < size) goFrom(i + 1, size, elms, acc + pow(elems(i),2).toInt)
      else acc
    }
    goFrom(0, elems.size, elems, 0)
  }
  def main(args: Array[String]) {
    val a1To5 = (1 to 5).toArray
    println("Testing with a1To5 = " +
      a1To5.mkString("Array(", ", ", ") ..."))
    val expectResult = 15
    checkPredicate(sumArrayIter(a1To5) == expectResult,
      "sumArrayIter(a1To5) == " + expectResult)
    checkPredicate(sumArrayRec1(0, a1To5) == expectResult,
      "sumArrayRec1(0, a1To5) == " + expectResult)
    checkPredicate(sumArrayRec2(a1To5) == expectResult,
      "sumArrayRec2(a1To5) == " + expectResult)
    print("\n")
    val sqrExpectResult = 55
    println("Testing with a1To5 = " +
      a1To5.mkString("Array(", ", ", ") ..."))
    checkPredicate(sumSqrArrayIter(a1To5) == sqrExpectResult,
      "sumSqrArrayIter(a1To5) == " + sqrExpectResult)
    checkPredicate(sumSqrArrayRec1(0, a1To5) == sqrExpectResult,
      "sumSqrArrayRec1(0, a1To5) == " + sqrExpectResult)
    checkPredicate(sumSqrArrayRec2(a1To5) == sqrExpectResult,
      "sumSqrArrayRec2(a1To5) == " + sqrExpectResult)
    print(sumSqrArrayIter((1 until 30000).toArray))
  }
}

//rozwiazania mozna uogolnic dodajac perametr funkcji przez ktora maja byc mapowane elementy