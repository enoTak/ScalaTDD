package pis

import org.scalatest.FunSuite

class RationalTest extends FunSuite
{
  test ("to string") {
    val expect = "2 / 3"
    val v = new Rational(2, 3)
    val actual = v.toString()
    assert(actual == expect)
  }

  test ("zero denominator") {
    assertThrows[IllegalArgumentException] {
      new Rational(2, 0)
    }
  }

  test( "addition") {
    val lhs = new Rational(1, 2)
    val rhs = new Rational(2, 3)
    val actual = lhs + rhs
    val expect = new Rational(7, 6)
    assert(expect == actual)
  }

  test( "subtraction") {
    val lhs = new Rational(1, 2)
    val rhs = new Rational(2, 3)
    val actual = lhs - rhs
    val expect = new Rational(-1, 6)
    assert(expect == actual)
  }

  test( "multiplication") {
    val lhs = new Rational(1, 2)
    val rhs = new Rational(1, 3)
    val actual = lhs * rhs
    val expect = new Rational(1, 6)
    assert(expect == actual)
  }

  test( "division") {
    val lhs = new Rational(1, 2)
    val rhs = new Rational(1, 3)
    val actual = lhs / rhs
    val expect = new Rational(3, 2)
    assert(expect == actual)
  }

  test( "addition with int") {
    val lhs = new Rational(2, 3)
    val actual = lhs + 2
    val expect = new Rational(8, 3)
    assert(expect == actual)
  }

  test( "subtraction with int") {
    val lhs = new Rational(2, 3)
    val actual = lhs - 2
    val expect = new Rational(-4, 3)
    assert(expect == actual)
  }

  test( "multiplication with int") {
    val lhs = new Rational(1, 2)
    val actual = lhs * 2
    val expect = new Rational(1, 1)
    assert(expect == actual)
  }

  test( "division with int") {
    val lhs = new Rational(1, 2)
    val actual = lhs / 2
    val expect = new Rational(1, 4)
    assert(expect == actual)
  }

  test( "reduction") {
    val lhs = new Rational(2, 4)
    val rhs = new Rational(1, 2)
    assert(lhs == rhs)
  }

  test( "compare two Rationals") {
    val smaller = new Rational(1, 3)
    val larger = new Rational(1, 2)
    assert(smaller lessThan larger)
  }

  test( "max of two Rationals") {
    val smaller = new Rational(1, 3)
    val larger = new Rational(1, 2)
    val expect = new Rational(1, 2)
    val actual = smaller max larger
    assert(expect == actual)
  }

  test( "integer") {
    val expect = new Rational(3, 1)
    val actual = new Rational(3)
    assert(expect == actual)
  }
}