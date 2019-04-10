package pis

class MultiTable(
  val size: Int,
  private val formatter: String => String,
  private val binaryOperator: (Int, Int) => Int)
{
  require(size > 0)

  private def makeRowSeq(row: Int) =
    for (col <- 1 to size) yield {
      val prod = binaryOperator(row, col).toString
      formatter(prod)
    }

  private def makeRow(row: Int): String
    = makeRowSeq(row).mkString

  def generate(): String = {
    val tableSeq =
      for (row <- 1 to size)
      yield makeRow(row)
    tableSeq.mkString("\n")
  }
}
