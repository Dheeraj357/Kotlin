//Write A Program For Explaining Concept OF List In Kotlin ...
//Array has limited value,we cann't update i.e. add & delete it ,so 'list,set' came into the picture .. 
fun main(args : Array<String>)
{
var values  = mutableListOf<Int>(8,9,4,2)
// In Kotlin list is by default immutable,so specifie mutable before listof() ..
// for upadation add(index.element) 
values.add(3)
for(i in values)
{
println(i)
}
// There Are Many Inbuilt Function 
println(values.indexOf(9))
 }
OUTPUT--->>>
8,9,4,2,3
1
##############################################
// List_Of_Object
data class Alien( var name:String,var points:Int)
fun main(args:Array<String>)
{
//var values  = listOf<Float>(8,9,4,2),this is for other type of list ..
var aliens : List<Alien>  = listOf<Alien>(Alien("Dhiraj",90),Alien("Vishal",80))
for(alien in aliens)
{
println(alien)
//println(alien.name)
}
}
OUTPUT--->>>
Alien(name=Dhiraj,points=90)
Alien(name=Vishal,points=80)