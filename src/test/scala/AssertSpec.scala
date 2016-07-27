import org.scalatest.{Matchers, FunSuite}

/**
 * Created by Noel on 7/27/16.
 */
class AssertSpec extends FunSuite with Matchers {

  test("hello scala"){
    println("hello!!!!!!")
  }

  test("assert"){
    val left = 2
    val right = 1
    assert(left == right)
  }

  test("myTest"){
    true shouldBe true

    val v1 = 4
    v1 shouldEqual 4

    assert(2 == 1 + 1)
  }

}
