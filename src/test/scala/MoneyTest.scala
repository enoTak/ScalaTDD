package money

import org.scalatest.FunSuite

class MoneyTest extends FunSuite {
  test("dollar multiplication")
  {
    val five = new Dollar(5)
    five.times(2)
    assert(10 == five.amount)
  }
}
