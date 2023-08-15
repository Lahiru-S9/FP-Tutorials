object Numbers {
  def classifyNumber(number: Int): String = number match {
    case n if n < 0 => "Negative"
    case 0 => "Zero"
    case n if n % 2 == 0 => "Even number"
    case _ => "Odd number"
  }

  def main(args: Array[String]): Unit = {
    val number = 10
    val classification = classifyNumber(number)
    println(s"$number is $classification")
  }

}
