import Examples._
import implicits.mult3
import implicits.max

object Main {

  def main(args: Array[String]): Unit = {

    // IMPLICIT PARAMETER TRANSFER

    // overriding of the implicit parameter is always possible
    val explicitOverrideResult = addNumber(2)(3)
    println(explicitOverrideResult)   // 5

    // explicit assignment of implicit value is always possible
    val explicitResult = addNumber(2)(max)
    println(explicitResult)           // 12

    // otherwise, the implicit value of `max` is used
    // that was imported into the scope
    val implicitResult = addNumber(2)
    println(implicitResult)           // 12

    // IMPLICIT METHOD TRANSFER

    // using it as anonymously defined function
    val anonymousF = multiplier(2)(x => x * 2)
    println(anonymousF)               // 4

    val explicitF = multiplier(2)(mult3)
    println(explicitF)                // 6

    val implicitF = multiplier(2) // mult3 is implicitely used
    println(implicitF)                // 6

  }

}
