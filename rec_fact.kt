// Write A Program For Factorial By Recursion In Kotlin ...
import java.util.*
fun main(args : Array<String>)
{
var num=5
println(fact(num))
}
fun fact(num:Int ): Int
{
if(num == 0)
 return 1
else
return num*fact(num-1)
}
// For Calculating More Number Of factorial i.e. 70,000,So Shift On BigInteger Datatype In math.* Package
OUTPUT --->>>
120

