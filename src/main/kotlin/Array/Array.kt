package Array
/*
* Collection
* Array
*
*  // How to create an Array
//    val names = <T> Genericity泛型
    val names = Array<String>(3,{i:Int -> String
        "Array<T> ①"
    })


    val names1 = Array<String>(3){
        "$it-str"
    }

    // iterate through arrays with iterator
    // Always used in Java
    val iterator = names1.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }


    //(iterator<String>) -> iterator<String>
    names1.iterator().also {
        while (it.hasNext()){
            println(it.next())
        }
    }


    for(i in names1.indices){
        //println(names1[i])
    }

    for(str in names1) {
        //println(str)
    }

    for((i,str) in names1.withIndex()){
//        println(str)
//        println(i)
    }
*
* List
* Set
* Map
* */

fun main() {
    val names2 = arrayOf("jack","rose")
    val names3 = arrayOfNulls<String>(3)
    val names4 = emptyArray<String>()

}