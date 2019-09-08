package io.kotlintest.example.mpp

fun fib(n: Int): Int = when (n) {
  0 -> 0
  1 -> 1
  else -> fib(n - 1) + fib(n - 2)
}