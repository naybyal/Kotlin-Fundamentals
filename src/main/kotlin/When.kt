fun main(args: Array<String>) {
    var alarm = 112
//    acts like a switch case
    when (alarm) {
        !in 10..11 -> println("The number is not in the range 10 to 11")
        12,24 -> println("The time is $alarm")
        7 -> println("The time is 7")
        14 -> println("The time is 2PM")
        in 1..9 -> println("The number is in the range 1 to 9")
        else -> println("What's the meaning of life?")
    }
    alarm = 12
    val text = when(alarm) {
        in 1..10 -> {
            "The number is in the range 1..10"
        }
        12,7,14 -> {
            println("Some text")
            "The time is $alarm"
        }
        else -> {
            "The time is ${alarm+1}"
        }
    }
    println(text)
    alarm = 11
    var text2 = when {
        alarm <= 10 -> "Th number is less that ten"
        alarm == 11 || alarm == 12 -> "The number is 11 or 12"
        else -> "The time is $alarm"
    }
    println(text2)
}