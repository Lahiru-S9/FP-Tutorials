object Interest {
  val calculateInterest: Double => Double = (depositAmount: Double) => {
    depositAmount match {
      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case amount => amount * 0.065
    }
  }

  def main(args: Array[String]): Unit = {
    val depositAmount = 1000000
    val interest = calculateInterest(depositAmount)
    println(s"Interest for $depositAmount is $interest")
  }


}
