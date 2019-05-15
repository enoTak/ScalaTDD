package pis

import org.scalatest.FunSuite

class ElementTest extends FunSuite {
  test("ArrayElement.contents") {
    val array = Array("hello", "world")
    val el = new ArrayElement(array)
    assert(array sameElements el.contents)
  }

  test("LineElement.contents") {
    val str = "*****"
    val el = new LineElement(str)
    val expect = Array(str)
    assert(expect sameElements el.contents)
  }

  test("UniformElement.contents") {
    val ch = '*'
    val el = new UniformElement(ch, 2, 3)
    val expect = Array("***", "***")
    assert(expect sameElements el.contents)
  }

  test("above") {
    val array = Array("hello", "world")
    val el1 = new ArrayElement(array)
    val str = "*****"
    val el2 = new LineElement(str)
    val actual = el1 above el2
    val expect = array ++ Array(str)
    assert(expect sameElements actual.contents)
  }

  test("beside") {
    val array = Array("hello", "world")
    val el1 = new ArrayElement(array)
    val ch = '!'
    val el2 = new UniformElement(ch, 2, 3)
    val actual = el1 beside el2
    val expect = Array("hello!!!", "world!!!")
    assert(expect sameElements actual.contents)
  }
}
