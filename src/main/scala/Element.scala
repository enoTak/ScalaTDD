package pis

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int =
    if (height == 0) 0 else contents(0).length

  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)

  def beside(that: Element): Element =
    new ArrayElement(
      for (
        (left, right) <- this.contents zip that.contents
      ) yield left + right
    )
}

class ArrayElement(
  val contents: Array[String]
) extends Element

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def height: Int = s.length
  override def width: Int = 1
}

class UniformElement(
  ch: Char,
  override val height: Int,
  override val width: Int
) extends Element {
  private val line = ch.toString * width
  def contents: Array[String] = Array.fill(height)(line)
}