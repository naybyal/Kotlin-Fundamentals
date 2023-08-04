fun main(args: Array<String>) {
    val cal = Calculator()
//    these won't work...
//    println(cal.sum(2,5))
//    println(cal.diff(5,2))

//    companion object can be used without creating an object.
    println(Calculator.sum(5,2))
    println(Calculator.diff(5,2))

    val maxOfInt = Int.MAX_VALUE
}

class Calculator() {
    companion object {
//        belongs to the class itself...
        fun sum (a: Int, b: Int) = a+b
        fun diff (a: Int, b: Int) = a-b
    }
}