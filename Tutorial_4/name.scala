object name {
  def toUpper (name: String):String = {
    name.toUpperCase
  }
  def toLower (name: String):String = {
    name.toLowerCase
  }

  def formatNames (name: String, aFunc: String => String): String = {
    aFunc(name)
  }

  def main (args: Array[String]): Unit = {



    println(formatNames("Benny",toUpper))
    println(formatNames("Ni",toUpper)+"roshan")
    println(formatNames("Saman",toLower))
    println("Kumar"+formatNames("a",toUpper))



  }
}
