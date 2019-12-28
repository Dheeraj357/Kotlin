//Write A Progarm For Explaining Concept Of data Class In Kotlin ..
data class Laptop(val brand : String,val price : Int)
{
 fun show()
{
 println("Awesome Machine.....")
}
}

fun main(args : Array<String>)
{
 var  lap1=Laptop("Dell",2000)
var  lap2=Laptop("Dell",2000)
var  lap3=lap1.copy()//copying first object into 3rd ..
println(lap1.equals(lap2))// comparing two Object by hash code or calculating ..
println(lap3)// printing using toString() method ..
}
OUTPUT--->>>
true
Laptop(brand=Dell,price=2000)
//This Is Data class Of Use Likewise ...
