object FilterEvenNum {
  def filterEvenNumbers(list: List[Int]): List[Int] = {
    list.filter(number => number % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(filterEvenNumbers(list))
  }

}
