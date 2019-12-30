// Higher_Order_Function i.e. Functional Programing ...
fun main(args:Array<String>)
{
var values = listOf<Int>(4,8,3,9)
//Here We PAss function to a Function ..
values.forEach({println(it)})
// 2nd 
values.forEach({n->println(n)})// Gives similar output
//3rd 
values.forEach(::println)// function reference ..
}
OUTPUT--->>>
4,8,3,9
4,8,3,9
4,8,3,9