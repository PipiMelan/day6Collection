package 泛型

/*
*
*  Generic class
*  Generic interface
*  Generic function
*
*
* kotlin : out = '? extends'  in java
*           in = super ?
* Type: Set teh upper limit
* Constraints on generics(泛型的约束) - in out
* When to use generitity :  When we define a class to operate alterable or uncertain data types
* */

 fun main() {
    /*val container = Container<Int>()
     container.add(1)
     container.add(2)
     container.get(1).also { println(it) }*/
    /*val btn = Button ("Login")
     btn.listener = object: OnClickListener<Button>{
         override fun onClick(v: Button) {
             println("${v.title} is touched")
         }
     }
     btn.userTouchDown()*/


   /* var fathers:Array<out Father> = emptyArray()
    var childs:Array<Child> = emptyArray()
    fathers = childs*/
    var fathers:Array<Father> = emptyArray()
    var childs:Array<in Child> = emptyArray()
    childs = fathers

     var list : List<Father> = listOfNotNull(Father(), Child())

}
//  can only take
//  can only be returned as a function value
//  can not be used to modify variables
class Test<in T>{
       fun show(var1:T ){

    }
}



/*class Temp:OnClickListener<Button>{
    override fun onClick(v: Button) {
        println("${v.title} is touched")
    }

}*/

open class Father

class Child :Father()








fun<T:Number,R:String> compare2(a:T,b:R):Boolean{
    return a == b
}


// The comparision object must be numbers
 fun<T:Number> compare1(a:T,b:T):Boolean{
     return a == b
 }
 fun compare(a:Int,b:Int):Boolean{
     return a == b
 }

interface OnClickListener<T> {
    fun onClick(v:T)
}
class Button(var title:String){
    //listener
    var listener : OnClickListener<Button>? = null
     fun userTouchDown(){
         // if anybody will spy on my event
         listener?.onClick(this)
     }
}


 class Container<T>{
//     lateinit var list:MutableList<T>
     private var list:MutableList<T> = mutableListOf()

     fun add(e: T){
         list.add(e)
     }

     fun get(index:Int):T{
//         return list.get(index)
         return list[index]
     }

 }