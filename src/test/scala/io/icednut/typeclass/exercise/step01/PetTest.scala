package io.icednut.typeclass.exercise.step01

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._

class PetTest extends AnyFunSuite {

  test("Pet 클래스 서브타이핑하기") {
    val a = Fish("Jimmy", 2)
    val b = a.renamed("Bob")

    a shouldBe Fish("Jimmy", 2)
    b shouldBe Fish("Bob", 2)
  }
}
