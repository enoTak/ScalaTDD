package pis

class MultiTable
{
  private def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = evaluate(row, col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }

  private def makeRow(row: Int) = makeRowSeq(row).mkString

  def generate() = {
    val tableSeq =
      for (row <- 1 to 10)
      yield makeRow(row)
    tableSeq.mkString("\n")
  }

  private def evaluate(row: Int, col: Int) =
  {
    row * col
  }
}
