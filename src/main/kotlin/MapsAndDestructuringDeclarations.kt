//there are three kinds of maps : maps, mutableMaps and hashmaps


fun main(){
    var simpleMap = mapOf<Int,String>( 1 to "pranathi" , 2 to "pragya")
    var x = mutableMapOf<Int,String>(1 to "pranathi" , 2 to "pragya")
    var hashMap = hashMapOf<Int,String>(1 to "pranathi" , 2 to "pragya")

    var keyList = listOf( simpleMap.keys) //making set of keys to list of keys
    println("keylist : $keyList")
    println( simpleMap.keys)
    println( simpleMap.values)

    //plus and minus operations on maps returns a complete new array
    println(simpleMap + Pair(3, "prana"))
    println(simpleMap - listOf(1)) //takes a simple number or else a collection

    //simpleMap.put() not possible
    x.put(3,"Prana") //put can be used to add new entry or change the value of the previous entry
    hashMap.put(3,"prana")

    x+= mapOf<Int,String>(2 to "pranati", 4 to "pragya")
    println(x)

    //to remove entries we can use remove method or else -(minus)
    x.remove(2)
    println(x)
    x.remove(4,"Praga") //doesnt remove anything since the value doesnot match
    println(x)
    x.keys.remove(1)
    println(x)
    x.values.remove("pragya")
    println(x)

    x-=3 //minus - on mutablemaps  removes the entries in the actual map
    println(x)

    for((k,v) in hashMap){
        println("here is key : $k and  value  $v")
    }
}