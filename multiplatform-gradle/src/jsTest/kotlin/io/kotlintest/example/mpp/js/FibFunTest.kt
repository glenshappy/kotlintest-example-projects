package io.kotlintest.example.mpp.js

import io.kotlintest.example.mpp.fib
import io.kotlintest.specs.FunSpec
import kotlin.test.assertEquals

class FibFunTest : FunSpec({

  test("a fib") {
    assertEquals(2, fib(3))
    assertEquals(3, fib(4))
    assertEquals(5, fib(5))
    assertEquals(8, fib(6))
    assertEquals(13, fib(7))
  }

  test("a failing fib") {
    assertEquals(1, 2)
  }

})