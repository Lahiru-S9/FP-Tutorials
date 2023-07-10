object primeSq {
  def isPrime(i: Int): Boolean = {
    if (i <= 1) false
    else if (i == 2) true
    else !(2 until i).exists(n => i % n == 0)
  }

  def primeSeq(n: Int): Unit = {
    if (n > 2) {
      primeSeq(n - 1)
      if (isPrime(n)) print(s"$n ")
    }
  }

  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

}
