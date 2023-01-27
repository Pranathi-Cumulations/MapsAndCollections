fun main(){
    //sequence construction from elements
    var sequence1 = sequenceOf(1,2,3)
    //sequence from iterables
    var numbers = arrayOf(1,2,3)
    var sequence2 = numbers.asSequence()
    //sequence from functions
    var firstSequence = generateSequence(1) { it+2}
    println(firstSequence.take(5).toList())
    //sequences from chunks using yield , yieldall
    var seq = sequence<Int> {yieldAll(generateSequence(4) { it*2 })  }
    println(seq.take(3).toList())

    //sequence and iterables work different , in iterables all the extension functions perform one by one  to all the elements
        //but in case of sequences for each element all the extension functions are performed and then for the next elements

    val words = "I am pranathi".split(" ")
    val wordsSequence = words.asSequence()

    val lengthsSequence = wordsSequence.filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }

    println(lengthsSequence.toList())
}