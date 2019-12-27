// Write A Program For Inheritance In Kotlin ...
// Like Java's 'final' Class In kotlin All Class & Method Are By Default ..
//So Deal With It By Introducing 'open' Keyword 
open class Human
{
  open fun think()
{
 println("Real Thinking ...")
}
}
class Alien : Human()
{
  override fun think()
{
   println("Virtual Thinking ...")
}
}

fun main(args:Array<String>)
{
 var may= Alien()
//var may: Human= Alien()
may.think()
}
//Like java ,If You Want To Refer A may as Of 1st Class and Object OF 2nd i.e. Human may = new Alien()
OUTPUT--->>>
Virtual Thinking ...
