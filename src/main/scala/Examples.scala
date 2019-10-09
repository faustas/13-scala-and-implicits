object Examples {

  /**
   * Add the second number to the first.
   *
   * @param base    The base number.
   * @param adder   The number that will be added.
   * @return The result of the two added numbers.
   */
  def addNumber(base: Int)(implicit adder: Int): Int = base + adder

  /**
   * Method that expects an implicit function for the concrete multiplication
   * process.
   *
   * @param base  The provided integer value.
   * @param f     Multiplication method that executes the multiplication.
   * @return Result of the multiplication.
   */
  def multiplier(base: Int)(implicit f: Int => Int): Int = f(base)

}

object implicits {

  /**
   * Implicit variable that can be imported into a specific scope
   */
  implicit val max: Int = 10

  /**
   * Implicit method.
   *
   * @return Result of the multiplication
   */
  implicit def mult3: Int => Int = _ * 3

}