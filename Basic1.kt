//This 2nd Step Of Kotlin Biggner ...
####################################
// Write A Program To Handle Null Exaception ..
fun main(args : Array<String>)
{
// Mainly '?' Operator Is Used For Handling Null Exception ..
var str : String? = null
// Similar We Can Done With Object ..
OUTPUT --->>
null
####################################
// Write A Program For 'Which' Statement In Kotlin 
// It's Very Similar To 'Switch' In C,C++
fun main(args : Array<String>)
{
//Decalaration Of Constant Value 
val num : Int = 2
//May Assign  'When' Expression As If_ELse .. 
when(num)
{
1-> println("One")
2-> println("Two")
3-> println("Three")
else -> println("Give Proper Input...")
}
}
OUTPUT --->>
Two
####################################
// Write A Program For A loops Concept ...
//Here While And Do_While Loop Similar As C,C++
fun main(args : Array<String>)
{
// Assign a Range To Variable ..
var nums= 1..5
// For Loop In Kotlin ..
for(a in nums)
{
println("This is Your Range Of For Loop :: "+a)
}
OUTPUT --->>

This is Your Range Of For Loop :: 1
This is Your Range Of For Loop :: 2
This is Your Range Of For Loop :: 3
This is Your Range Of For Loop :: 4
This is Your Range Of For Loop :: 5
####################################
// Write A Program printing Range Of value With 2  Difference value In Each ...
fun main(args : Array<String>)
{
// Assign a Range To Variable ..
var nums= 1..16
// For Loop In Kotlin ..
for(a in nums step 2)
{
println(a)
}
}
OUTPUT --->>
1
3
5
7
9
11
13
15
####################################
fun main(args : Array<String>)
{
// 'downTo' Is used To Print Output In decreasing Order
var nums= 6 downTo 1
// 'until' Is Used To Print Sprecifie Range Except Maximum Limit Value ..
var nums2 = 1 until 5 
// For Loop In Kotlin ..
println("This is Output Of  Numbers In Decreasing Order..")
for(a in nums)
{ 
println(a)
}
//THis is For Printing In Range Value ..
// Instead Of It You May Used reversed() 
// Count() is for Counting 
println("This is Output Of  Numbers In Range..")
for(b in nums2)
{
println(b)
}
println("count Is "+nums2.count())
}
OUTPUT --->>
This is Output Of  Numbers In Decreasing Order..
6
5
4
3
2
1
 This is Output Of  Numbers In Range ..
1
2
3
4
count Is 4
####################################
// Write A Program For A List Concept ...
fun main(args : Array<String>)
{
var nums = listOf(1,2,3,4)
for ((i,e) in nums.withIndex())
{
println("$i : $e")
}
}
OUTPUT --->>
0:1
1:2
2:3
3:4
// Write A Program For A  Map Concept ...
import java.util.*
fun main(args : Array<String>)
{
// Map Contain key-Value Pair like Dictionary In Python ..
var fun = TreeMap<String,Int>()
fun["Dhiraj"] = 13135 
fun["Vishal"] = 23135
for ((name,id) in fun)
{
println("$name : $id")
}
}
OUTPUT --->>
Dhiraj : 13135
Vishal : 23135
// Now You Are  One Step Ahead As Per Previous Step/Knowledge ...