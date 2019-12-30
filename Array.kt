//Write A Program For Array In Kotlin ..
fun main(args:Array<String>)
{
println("This Is First Decalration's Output :: ")
// We Have Dynamic  Array Value or specifie Size ..
var num's=IntArray(4) // Not Only it You May Apply Float,Double etc. expect String
num's.set(0,10)
num's.set(1,12)
num's.set(2,13)
num's.set(3,14)
// To Print Array ..
for(i in num's)
     println(i)
// All In One Decalration ..
var UNi_Array=arrayOfNulls<String>(5)
// here in '<>' you may Specifie Any Datatype  in kotlin and '()' size of it .. 
|||OR |||
println("From Here Static Array's Output Start :: ")
//Array decalration  To Specifie Value In Kotlin ..
var nums = intArrayOf(22,12,14,26)
// We Can Upadate It ..
nums[1]=13 // HEre You Can Use "nums.set(1,13)"
// We also HAve Here to Check Last Value  like last() &  specifie get() with index value  ..
println("this is last element of Array :: ")
println(nums.last())
// To Print Array ..
for(i in nums)
     println(i)
} 
OUTPUT--->>>
This Is First Decalration's Output :: 
10
12
13
14
From Here Static Array's Output Start :: 
this is last element of Array :: 
26

22
13
14
26