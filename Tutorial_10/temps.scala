object temps {
  def calculateAverage(temperatures: List[Double]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
    val totalFahrenheit = fahrenheitTemperatures.reduce(_ + _)
    val averageFahrenheit = totalFahrenheit / temperatures.length
    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    val temperatures = List(0.0, 10.0, 20.0, 30.0)
    val averageTemp = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $averageTemp")
  }
}

