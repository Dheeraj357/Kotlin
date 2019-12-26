// Write A Program For Extended Function ...
//File 1.kt
####################################
class Alien
{
 var skills : String? = null
fun show()
{
println(skills)
}
}
//File2.kt
fun main(args : Array<String>)
{
// Object Creation 
var a1=Alien()
a1.skills="Java"
a1.show()

var a2=Alien()
a2.skills="SQL"
a2.show()

var a3 = a1.plus(a2)
a3.show()
}
// This Is Method Which Is Consider As Extended Function 
// It's In 2nd File But A Part Of 1st File's Class ..
fun Alien.plus(a:Alien): Alien
{
var newAlien = Alien()
// Here  'this' Keyword Is Refer a1 Object And 'a' Parameter a2 Object ..
newAlien.skills = this.skills + " "+a.skills
return newAlien
}
OUTPUT--->>>
Java
SQL
Java SQL
############################################################
// Explain Concept Of Infix And Operator Overloding ...
// Copy Same Program As Above & Replace Remaining Syntax From Below ..
// Infix Overloding Working With Only Single Input Extended function
// Infix Is Used For Write Plain English Statement On Function Invocation ..
 1.var a3 = a1 plus a2
2. infix fun Alien.plus(a : Alien):Alien
{//similar As Above}
#####################################################
// operator Overloding Is Used for Use Of Operator's On Function Invocation ..
// This Is Specific Given On Official Website i.e. kotlinlang.org
1. var a3= a1 + a2
2. operator infix fun Alien.plus(a : Alien):Alien
{//similar As Above}
//output Is Also Similar ..

