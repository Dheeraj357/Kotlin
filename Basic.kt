//This Is Biggner Direction For Kotlin Coder ....!!!
########################################
//Write A Program For Hello World In Kotlin ...
fun main(args : Array<String>)
{
println("Hello Friends...")
}
OUTPUT -->>
Hello Friends...
########################################
//Write A Program For Variable Decalaration And Perform Arithmatic Operations ...
fun main(args : Array<String>)
{
//var Keyword For Variable Decalaration & val For Constant ..
//val PI
var  num1 : Int =4
var num2 : Int = 5
//Make Similar Operations Like Any Programining Langauages ..  
result = num1+num2
// $ For Refer Variable in Output Statement
println("The Addition Of $num1 And $num2 is $result")
}
OUTPUT -->>
The Addition Of 4 And 5 is 9
########################################
// Write A Program For If-elseIF-else Expression ....
fun main(args : Array<String>)
{
var  num1 : Int =4
var num2 : Int = 5
var result :  Int=0
if(num1 > num2)
  result=num1
else if (num1 < num2)
  result=num2
else
   result=0
//When You Are Using If-elseIf-Else Manadatory  To Mention Else Statement In Kotlin ...
println("Greater Number Is :: $result")
  }
OUTPUT -->>
Greater Number Is :: 5
|||||||||| OR ||||||||||
//It's Used When IF-ELSE Consider As Expression ..
fun main(args : Array<String>)
{
var  num1 : Int =4
var num2 : Int = 5
var result :  Int=0
result=if(num1 > num2)
 num1
else if(num1<num2)
 num2
else
 0
println("Greater Number Is :: $result")
  }
########################################
//Write A Program For String Comaparision ....!!
fun main(args : Array<String>)
{
var str1 : String = "Dhiraj"
var str2 : String ="Dhiraj"
//Like A Java ..
if(str1.equals(str2))
  println("same")
else
  println("Not Same")
||||| OR |||||
if(str1==str2)
  println("Numbers Is Same")
else
  println("Number Is Not Same")
}
OUTPUT -->>
Number Is Same
########################################
//Write A Program For Showing Basic Of Oops i.e. Object Creation ...
//Here Make Two Different Files i.e. File1 And File2
File_1.kt ---->>>
class One
{
var name : String =""
}
File_2.kt --->>>
fun main(args : Array<String>)
{
//This Object Creation ..
 var  star = One()
 star.name="Dhiraj"
println("Name Is :: "+star.name)
}
OUTPUT -->>
//Is OF File_2
Name Is :: Dhiraj
########################################
//HAve A HAppy Coding ...!!!


