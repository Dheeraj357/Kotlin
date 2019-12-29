//Write A Program For Explaning Concept Of Companion Object ...
// java and kotlin inter-operable...
class A
{
 companion object
{
//this anotation is limites with Companion Object  only...
@JvmStatic //anotation in kotlin used for java file ...  
   fun show()
{
  println("Hello Friends ....!!")
}
}  
}
fun main(args : Array<String>)
{
A.show()
}
	file2.java
public class Runner
{
public static void main(String[] a)
{
A.show()
}
}
NOTE-::
// If You Want To Run Above File On Kotlin plateform Than remove anotation ...
OUTPUT--->>>
//This is Same For Both..
Hello Friends ....!!
###########################################
//Write A Program For Factory Pattern By Companion object ...
class A
{
//Here Companion object is usefull for creation complex logic of object creation   
companion object{
   fun create(): A=A()    
   }
fun show()
{
println("in Show ...")
}
}
fun main(args:Array<String>)
{
var obj=A.create()
obj.show()
}
OUTPUT--->>>
in Show ...