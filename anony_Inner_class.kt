//Write A Program For Explaining  Concept Of Anonymous inner class
interface Human
{
// Due Interface Here Method Is Of Type Open 
fun think()
}
fun main(args:Array<String>)
{
// usecase 'object' Keyword .. 
var programmer : Human = object:Human
   		    {
		       // Here Is Defining Method  
		           override fun think()
			{
			    println("Think Virtually......")
			}
		    }
programmer.think()
}
OUTPUT--->>>
Think Virtually......