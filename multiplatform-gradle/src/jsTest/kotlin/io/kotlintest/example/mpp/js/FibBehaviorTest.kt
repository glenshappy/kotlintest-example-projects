package io.kotlintest.example.mpp.js

import io.kotlintest.example.mpp.fib
import io.kotlintest.specs.BehaviorSpec
import kotlin.test.assertEquals

class FibBehaviorTest : BehaviorSpec({

  given("a fib") {
    When("we do something") {
      then("should be right") {
        assertEquals(2, fib(3))
        assertEquals(3, fib(4))
        assertEquals(5, fib(5))
        assertEquals(8, fib(6))
        assertEquals(13, fib(7))
      }
    }
    When("we do something else") {
      then("should fail") {
        assertEquals(1, 2)
      }
    }
  }

})