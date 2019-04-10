package pis

import org.scalatest.FunSuite

class MultiTableTest extends FunSuite
{
  test("generate")
  {
    val size = 3
    val formatter = (x: String) =>  x + " " * (2 - x.length)
    val operator = (x: Int, y:Int) => x * y

    val table = new MultiTable(size, formatter, operator)
    val actual = table.generate()

    val expect =
      "1 2 3 \n2 4 6 \n3 6 9 "

    assert(expect == actual)
  }
}
