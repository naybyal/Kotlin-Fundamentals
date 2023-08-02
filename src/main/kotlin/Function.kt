//  Case of method overloading
fun greetHello() {
    println("Hello")
}
fun greetHello(message: String, num: Int) {
    println("Hello, $message$num!")
//    println("If we use + to concatenate")
//    println("Hello, "+message+num)
}
fun getData(data: String) {
    println("Data fetched : $data")
}
fun showMessage() {
    println("No data fetched! No internet connectivity.")
}
fun main(args: Array<String>) {
//    greetHello()
    greetHello("Eagle", 13)
    var hasInternetConnection = false;
    println("Internet Connection established? $hasInternetConnection")
    if (hasInternetConnection) {
        getData("zlibrary is active now!")
    } else {
        showMessage()
    }
    println(getMaxValue(5,2))
    val max = getMax(20,2)
    println(max)
    sendMessage("Alexa", "Hello")
//    if the user doesn't wanna pass any message
    sendMessage()
    println(sendText())
    println(sum(5,6,7,8,20))
    printNum(1,2,3,4,5,6,7,8,9)

}

fun getMaxValue(a: Int, b: Int): Int {
//    return (a>b)?a:b      there's no ternary operator in Kotlin
    var max = if (a>b) a else b
    return max
}
//  A similar function is ...
fun getMax(a: Int, b: Int): Int = if (a>b) a else b

// Default values
fun sendMessage(name: String = "User", message: String = "") {
    println("message = $message and name = $name")
//    if no params are passed... name: String="" will make the function run
}

fun sendText() = "Some text"


//  vararg keyword

//fun sum(a: Int, b: Int, c: Int, d: Int): Int {
//    return a+b+c+d
//}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for(num in numbers) {
        result += num
    }
    return result
}

fun printNum(vararg numbers: Int) {
    numbers.forEach {
        println(it)
    }
}