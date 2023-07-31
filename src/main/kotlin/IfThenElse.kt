fun main(args: Array<String>) {
    val isActive = true
    if (isActive)
            println("It's true that something is active.")
    else
            println("It's true that something is inactive.")

    val myNumber = Math.random()*1000
    println("my number : " + myNumber)
    if (myNumber < 100)
            println("It's true that my number is less than 100")
    else if (myNumber == 100.0)
            println("It's true that my number is 100")
    else
            println("It's true that my number is greater than 100")

    if (myNumber != 100.0)
            println("This number is not equal to 100")
    else if (myNumber>=100.0)
            println("This number is greater than or equal to 100") //   as stupid as it can be.

    if(!isActive)
            println("Is not active.")
    else
            println("Is active.")

//    logical AND, OR

    val isPlaying = true
    val score = 80
    if (isPlaying && score == 100) {
        println("The user is playing and the score is 100")
    }
    else
        println("Still at the same level.")

    val num1 = 5
    val num2 = 4
    println("num1 = $num1 : num2 = $num2")

    if (num1 > 0 || num2 >0)
            println("The condition is true that num1>0 or num2>0")
    else println("both the conditions are false")



    val text = if (num1 > 0 || num2 >0) {
        println("The condition is true that num1>0 or num2>0")
        "This is text1"
    } else {
        println("both the conditions are false")
        "This is text2"
    }
    println(text)

    val answer = if (2>5) true else false
    println(answer)

}