class Rational (n: Int, d: Int){

  require(d != 0, "Denominator cannot be zero")

  private val gcdVal = gcd(n.abs, d.abs)
  val numer = n / gcdVal
  val denom = d / gcdVal

  def this(n: Int) = this(n, 1)

  def neg: Rational = new Rational(-numer, denom)

  override def toString: String = s"$numer/$denom"

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

}

object Rational {
  def sub(r1: Rational, r2: Rational): Rational = {
    new Rational(r1.numer * r2.denom - r2.numer * r1.denom, r1.denom * r2.denom)
  }
}

object Main1 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    val result = Rational.sub(Rational.sub(x, y), z)
    println(result)
    val negX = x.neg
    println(negX)
  }
}


