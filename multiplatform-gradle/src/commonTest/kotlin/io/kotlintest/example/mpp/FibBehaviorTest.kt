package io.kotlintest.example.mpp

import io.kotlintest.shouldBe
import io.kotlintest.specs.BehaviorSpec

class FibBehaviorTest : BehaviorSpec({

  given("a fib") {
    When("we do something") {
      then("should be right") {
        fib(3) shouldBe 2
        fib(4) shouldBe 3
        fib(5) shouldBe 5
        fib(6) shouldBe 8
        fib(7) shouldBe 13
      }
    }
    When("we do something else") {
      then("should fail") {
        fib(3) shouldBe 20
      }
    }
  }

})