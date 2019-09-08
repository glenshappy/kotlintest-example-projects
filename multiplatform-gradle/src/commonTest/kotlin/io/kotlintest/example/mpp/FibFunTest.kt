package io.kotlintest.example.mpp

import io.kotlintest.shouldBe
import io.kotlintest.specs.FunSpec

class FibFunTest : FunSpec({

  test("a fib") {
    fib(3) shouldBe 2
    fib(4) shouldBe 3
    fib(5) shouldBe 5
    fib(6) shouldBe 8
    fib(7) shouldBe 13
  }

  test("a failing fib") {
    fib(3) shouldBe 20
  }

})