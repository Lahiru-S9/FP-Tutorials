object SUM {
  def sum(n: Int): Int = {
    if (n==0) return 0
    n + sum(n-1)
  }

  def main (args: Array[String]): Unit = {
    println(sum(4))

  }
}
