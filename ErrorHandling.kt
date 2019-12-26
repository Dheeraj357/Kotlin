// Write A Program To Explain Error Handling Concept ...
fun main(args  Array<String>)
{ 
var str : String ="4a"
var num :Int=0
// This is block which Contains Only Operational Statement .. 
try{
num = str.toInt()
}
//This Is Catch Block Which May Multiple In Numbers With Single Try Block .. Here You Mention Only Exception OR Specific Error .. 
catch(e: NumberFormatException){
println("Give A Proper Input..!!")
} 
//This is Block Execute Always ..  
finally{
num++
println("After Conversion Your Number Is ::"+num) 
}
}
OUTPUT--->>>
Give A Proper Input..!!
After Conversion Your Number Is ::1
//This Try Statement May Work As Expression .. That Done By Variable Allocation
