object prime {
  def filterPrime(list: List[Int]): List[Int] = {
    list.filter(number => number >1 && (2 until number).forall(number % _ != 0))
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 7, 8, 9, 10, 11)
    println(filterPrime(list))
  }

}
