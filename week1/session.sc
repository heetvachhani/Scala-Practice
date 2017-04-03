package week1

object session {
  3 + 2                                           //> res0: Int(5) = 5
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  abs(-1)                                         //> res1: Double = 1.0

  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
    loop(1, n)
  }                                               //> factorial: (n: Int)Int
  factorial(4)                                    //> res2: Int = 24
}