package com.github.scalacommon

object Math {
  final def trunc(x: Double, n: Int): Double = {
    if (n > 0) trunc(x * 10, n - 1) * 0.1
    else if (n < 0) trunc(x * 0.1, n + 1) * 0.1
    else math.round(n)
  }
}
