package week1

import scala.collection.mutable.Stack

object assignment1 {
  println("This is Recursion assignment!")        //> This is Recursion assignment!

  // check parentheses
  def balance(chars: List[Char]): Boolean = {
    val st = new Stack();

    def checkParen(chars: List[Char], count: Int): Boolean = {
      if (chars.isEmpty)
        true
      else {
        val first = chars.head
        val next =
          if (first == '(') count + 1
          else if (first == ')') count - 1
          else
            count
        if (next >= 0) checkParen(chars.tail, next)
        else false
      }
    }
    checkParen(chars, 0)
  }                                               //> balance: (chars: List[Char])Boolean

  val input = "((())"                             //> input  : String = ((())

  balance(input.toCharArray().toList)             //> res0: Boolean = true

}