package money

import org.scalatest.FunSuite

class MoneyTest extends FunSuite {
  test("dollar multiplication") {
    val five = new Dollar(5)
    val doubled = five.times(2)
    assert(doubled.amount == 10)
    val tripled =five.times(3)
    assert(tripled.amount == 15)
  }
}
