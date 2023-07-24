object Fibonacci {
  def fibonacci(n: Int): List[Int] = {
    if (n <= 0) List()
    else if (n == 1) List(0)
    else if (n == 2) List(0, 1)
    else {
      val fibSeq = fibonacci(n - 1)
      val nextFib = fibSeq(n - 2) + fibSeq(n - 3)
      fibSeq :+ nextFib
    }
  }



  def main (args: Array[String]): Unit = {
    val n = 10
    val fibNumbers = fibonacci(n)
    println(fibNumbers)
  }
}
