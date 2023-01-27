data class Student(var name: String , var id: Int , var isHosteler: Boolean)
//there are various types of collections
// arrays , lists , sets
fun main() {
    var arr1 = arrayOf(1, 2, 3, 3, 4)
    var arrSet = arr1.toSet(); // unique elements

    var list1 = listOf<Int>(1, 2, 3, 4)
    var list2 = listOf<Int>(1, 8, 7, 10)

    println(list2.sorted())

    println(list1.reversed())

    println(list1.reduce { result, i -> i + result })

    var arrayUnion = list1.union(list2)
    var arrayIntersection = list1.intersect(list2)

    println(arrayUnion)
    println(arrayIntersection)


    var student1 = Student("pranathi", 1, true)
    var student2 = Student("prana", 2, true)
    var student3 = Student("pragya", 3, false)
    var listStudents = setOf<Student>(student1, student2, student3)

    println(listStudents.find { it.isHosteler == false })


    var studentsMap = listStudents.associateBy { it.id }
    println(studentsMap)

    var listToString = listStudents.joinToString { it.name }
    println(listToString)

    //partioning of the lists based on the condition
    var (hostelers, nonHostelers) = listStudents.partition { it.isHosteler }
    println(hostelers)
    println(nonHostelers)



}