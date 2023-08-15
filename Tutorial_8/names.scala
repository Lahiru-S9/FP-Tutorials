
object NameFormatter {
  def toUpper(input: String): String = input.toUpperCase

  def toLower(input: String): String = input.toLowerCase

  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }


  def main(args: Array[String]): Unit = {


    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    println(formatNames(names(0), toUpper))
    println("N" + formatNames("iroshan", toLower))
    println(formatNames(names(2), toLower))
    println("K"+formatNames("umar", toLower)+"A")
  }

}
