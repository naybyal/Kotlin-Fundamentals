//  Arrays
fun main(args: Array<String>) {
//    val names: Array<String> = arrayOf("John", "Steven", "Meghan")
    val names = arrayOf("John", "Steven", "Meghan")
//    println(names) won't work. Hence, we use a for loop
    for (name in names) {
        println(name)
    }

//    to print an element
    println("To print an element...")
//    println(names[1])
    println("Element at index 1 is ${names[1]}")

//    to display the size of array
    println("The array size is ${names.size}")

//    array of various types
    val numbers = arrayOf(1,2,3,"Eagle",'6')
    for (i in numbers)  println(i)
    // String only
    for (i in numbers) {
        if (i is String)
                println(i)
    }
    //  int only
    for (i in numbers) {
        if (i is Int)
            println(i)
    }
    // char only
    for (i in numbers) {
        if (i is Char)
            println(i)
    }
}