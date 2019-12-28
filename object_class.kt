//Write A Program For Explaining  Concept Of Object Class ...
// 'object' keyword is used where our class is Single means where you cann't create such similar class .. 
// They are In relation like Book with BookShelf ... One With Multiple  
data class Book(var name:String,var price:Int)
object BookShelf
{
// variable declaration Is Of Type ArrayListOf  
var books = arrayListOf<Book>()
fun showBooks()
{
 for( i in books)
{
println(i)
}}}}
fun main(args:Array<String>)
{
//object class never need To Create Object,we can access there elements by name only ..
BookShelf.books.add(Book("Java",50))
BookShelf.books.add(Book("SQL",40))
BookShelf.books.add(Book("Kotlin",80))
BookShelf.showBooks()
} 
OUTPUT--->>>
Book(name=Java,price=50)
Book(name=SQL,price=40)
Book(name=Kotlin,price=80)