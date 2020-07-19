package Collection

/*
* In Kotlin , the aggregate type(集合类型) is mutable or immutable
* For the interface : Collection <- MutableCollection
* Under it:               ↑             ↑
*                       List        MutableList
*  //Create a List
    val names1 : List<String?> = List(3){ null }
    val names2 : List<String> = listOf()
    val names3 : List<String> = listOf("jack","rose")
    val names4 : List<String> = emptyList()
//    names3.indexOf("jack").also { println(it) }
//    names3.indexOf("john").also { println(it) }
//    names3.listIterator().
*                       Set         MutableSet
*
* map映射：
*                       Map(K,V)    <-     MutableMap
* */

fun main() {


    val names1 : MutableList<String?> = MutableList(3){null}
    val names2 : MutableList<String?> = mutableListOf()
    val names3 : MutableList<String?> = mutableListOf("jack","rose","Jack")

    names3.listIterator().also {
        while (it.hasNext()){
            it.next().also {item ->
                if(item =="jack") it.remove()
            }
        }
    }
    println("size: ${names3.size}")
    for (item in names3)
    {
        println(item)
    }}