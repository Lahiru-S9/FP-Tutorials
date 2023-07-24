object evenOdd {
  def isEvenOdd(n: Int): String = {
    if (n == 0) return "Even"
    else if (n == 1) return "Odd"
    else isEvenOdd(n - 2)
  }

  def main(args: Array[String]): Unit = {
    println(isEvenOdd(49))
  }
}
