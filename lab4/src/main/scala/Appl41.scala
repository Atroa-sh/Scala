
object Appl41 {
  import scala.annotation.tailrec
  def factorial(n: Int):Int = {
    assert(n >= 0)
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }

  def fibb(n: Int):Int = {
    assert(n >= 0)
    if (n == 0 || n == 1) n
    else fibb(n - 2) + fibb(n - 1)
  }
  def factorialTail(n: Int):Int = {
    @tailrec
    def factorialEngine(acc: Int , curr: Int):Int ={
      if(curr<=n)factorialEngine(acc*curr,curr+1)
      else acc
    }
    factorialEngine(1,2)
  }
  def fibbTail(n: Int):Int = {
    @tailrec
    def fibbEngine(prev: Int , curr: Int , end: Int): Int ={
      if(end == 0)return curr
      if(end == -1) return prev
      fibbEngine(curr , curr+prev , end - 1)
    }
    fibbEngine(0,1,n-1)
  }

  def main(args: Array[String]) {
    println("5! = " + factorial(5))
    println("Fibb(10) = " + fibb(10))
    print(fibbTail(0) + "\n")
    print(factorialTail(20) + "\n")
  }
}