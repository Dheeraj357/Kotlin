// Write A Program For Factorial By Recursion In Kotlin ...
import java.math.*
import java.util.*
fun main(args : Array<String>)
{
var num=BigInteger("70,000")
println(fact(num))
}
fun fact(num:BigInteger ): BIgInteger
{
if(num == BigInteger.ZERO)
 return BigInteger.ONE
else
return num*fact(num-BigInteger.ONE)
}
// Stay Till Output ...

