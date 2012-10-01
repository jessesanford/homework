package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c == 0) return 1
    if(r == 0) return 0
    if(c > r) return 0
    return pascal(c-1,r-1) + pascal(c,r-1)
  }
  


  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    if(chars.isEmpty) return true
    
    def matchParens(chars: List[Char], opening: List[Char], closing: List[Char]): Boolean = {
      val spaceStr: String = " "
      val space = spaceStr.charAt(0)
      def parensBalanced(opening: List[Char], closing: List[Char]): Boolean = {
        if(opening.isEmpty && closing.isEmpty) return true
        if((opening.head != space) && (closing.head != space)) parensBalanced(opening.tail, closing.tail)
        return false
      }
      if(chars.isEmpty) return parensBalanced(opening, closing)

      matchParens(chars.tail, chars.head :: opening, space :: closing)
      
    }
  }

  
 

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
