package week2

object session {
  // High order functions

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)                  //> sum: (f: Int => Int, a: Int, b: Int)Int

  def sumInts(a: Int, b: Int) = sum(x => x, a, b) //> sumInts: (a: Int, b: Int)Int
  sumInts(1, 5)                                   //> res0: Int = 15

  def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)
                                                  //> sumCubes: (a: Int, b: Int)Int
  sumCubes(1, 2)                                  //> res1: Int = 9

  // Currying
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)              //> product: (f: Int => Int)(a: Int, b: Int)Int
	product(x=>x*x)(1,2)                      //> res2: Int = 4
	
	def fact(n:Int) = product(x=>x)(1,n)      //> fact: (n: Int)Int
	fact(5)                                   //> res3: Int = 120
	
	
}