package pis

class Rational (n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numerator = n / g
  val denominator = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational =
    new Rational(
      numerator * that.denominator + that.numerator * denominator,
      denominator * that.denominator)

  def + (that: Int): Rational =
    new Rational(
      numerator + that * denominator,
      denominator)

  def - (that: Rational): Rational =
    new Rational(
      numerator * that.denominator - that.numerator * denominator,
      denominator * that.denominator)

  def - (that: Int): Rational =
    new Rational(
      numerator - that * denominator,
      denominator)

  def * (that: Rational): Rational =
    new Rational(
      numerator * that.numerator,
      denominator * that.denominator)

  def * (that: Int): Rational =
    new Rational(
      numerator * that,
      denominator)

  def / (that: Rational): Rational =
    new Rational(
      numerator * that.denominator,
      denominator * that.numerator)

  def / (that: Int): Rational =
    new Rational(
      numerator,
      denominator * that)

  def lessThan(that: Rational): Boolean =
    numerator * that.denominator < that.numerator * denominator

  def max(that: Rational): Rational =
    if (this lessThan that) that else this

  private def gcd(lhs: Int, rhs: Int): Int =
    if (rhs == 0) lhs else gcd(rhs, lhs % rhs)

  override def toString: String = s"$numerator / $denominator"

  override def equals(obj: Any): Boolean = {
    val that = obj.asInstanceOf[Rational]
    (numerator == that.numerator) && (denominator == that.denominator)
  }
}
