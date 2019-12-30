//Filter_Map
fun main(args:Array<String>)
{
var values = listOf<Int>(4,3,5,7,8)
// Here 'it' represent Current Reference ..
var even's = values.filter { it%2==0 }
even's.forEach({println(it)})
// After It You Want To Perform Operation On It ..
var Doubles = even's.map{ it*2}
Doubles.forEach({println(it)})
// you may write in consize way ..
var results = values
	       .filter{it%2==0}
	       .map{it*2}
results.forEach({println(it)})
}
OUTPUT--->>>
4,8
8,16
8,16
//THis Is All About Kotlin ...
