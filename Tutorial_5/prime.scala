object prime {
  def isDevisable(n: Int, d: Int): Boolean = {
    if (d <= 1) false
    else if (n % d == 0) true
    else isDevisable(n,d-1)
  }
  def prime (n: Int): Boolean = {
    if (n <= 1) false
    else !isDevisable(n,math.sqrt(n).toInt)
  }


  def main(args: Array[String]): Unit = {
    println(prime(16))
    println(prime(5))
  }
}
