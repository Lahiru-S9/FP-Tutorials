object squre {
  def calculateSquare(inputlist: List[Int]): List[Int] = {
    inputlist.map(number => number * number)
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(calculateSquare(list))
  }

}
