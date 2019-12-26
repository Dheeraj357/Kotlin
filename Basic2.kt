//Write A Program For Functional Expression In Kotlin ...
fun main(args : Array<String>)
{
var result=Max(8,65)
println("Your Resultent Maximum Value Is :: "+result)
add(4,5)
}
fun Add(a:Int,b:Int)
{
println("Your Addition Is ::"+(a+b))
}
||||| OR |||||
fun Add(a:Int,b:Int) : Int = a+b
fun Max(a:Int,b:Int):Int = if(a>b) a else b 
OUTPUT ---->>>
Your Resultent Maximum Value Is :: 65
Your Addition Is :: 9
##########################################
//Write A Program For Calculation Of Interest On Amount ...
fun main( args: Array<String>)
{
var finalAmt = calAmount(50,0.03)
println("Your Total Amount With Interest Is :: $finalAmt")
}
fun calAmount( amt: Int ,interest : Double = 0.04): Int
{
// 'toInt' Method For typecasting From Double To Integer ..
return (amt+amt*interest).toInt();
}
OUTPUT ---->>>
Your Total Amount With Interest Is :: 51
##########################################
// Write A Program For Coversion Of  String To Integer ...
fun main(args:Array<String>)
{
var str : String = "4"
var num : Int = str.toInt()
num++
println("Number After Conversion Is :: "+num)
}
OUTPUT ---->>>
Number After Conversion Is :: 5
##########################################
// Have A Happy Coding ...

