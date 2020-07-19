package Collection

/*
* Interface Map    <-    MutableMap
* Subclass
*
*       HashMap     MutableHashMap
*       LinkedMap   MutableLinkedMap
* */

fun main() {
    val dic1 = mapOf<String,String>()
    val dic2 = mapOf<String,String>(
    Pair("English","英文"),Pair("Chinese","中文")
    )

    val dic3 = hashMapOf<String,String>()
    val dic4 = hashMapOf<String,String>(
        Pair("English","英文"),Pair("Chinese","中文")
    )

    val dic5 = linkedMapOf<String,String>()
    val dic6 = linkedMapOf<String,String>(
        Pair("English","英文"),Pair("Chinese","中文")
    )

    println(dic6.keys)
    println(dic6.values)
    println(dic6["English"])
    println(dic6["Japanese"])
    println(dic6.entries)

    dic6.entries.forEach{
        println("${it.key} -- ${it.value}")
    }

    //MutableMap
    val name1 = mutableMapOf<String,String>()
    val name2 = mutableMapOf<String,String>(
        Pair("Tony","托尼大师")
    )

    name2.put("小王","0.0")
    name2["老王"] = "0.0"

}