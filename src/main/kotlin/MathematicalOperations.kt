fun main(args: Array<String>) {
    var x = 5
    var y = 3

    var result = x+y
    println("result = $result")
//    another way of doing this :
    println("sum = ${x+y}")  // just like in BASH // ADD
    println("difference = ${x-y}")  // SUBTRACT
    println("product = ${x*y}")  // MULTIPLY
    println("quotient = ${x/y}")  // DIVIDE
    println("remainder = ${x%y}") // MODULO DIVISION
    println()

    result += 2 //  result = result + 2
    println("+=2 updated result =  $result")

    result *= 2 //  result = result * 2
    println("*=2 updated result =  $result")

    result -= 2 //  result = result - 2
    println("-=2 updated result =  $result")

    result /= 2 //  result = result / 2
    println("/=2 updated result =  $result")

    result %= 2 //  result = result % 2
    println("%=2 updated result =  $result")

    x=0
    println()
    println("x = $x")
    println("x++ = ${x++}")
    println("++x = ${++x}")
    println("x-- = ${x--}")
    println("--x = ${--x}")

}