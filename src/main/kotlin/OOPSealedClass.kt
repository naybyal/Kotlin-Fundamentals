fun main() {
    val passed = Result.Success("Success!")
    val error = Result.Failed("Failed.")

    getData(passed)
    getData(error)

}

fun getData(result: Result) {
    when (result) {
        is Result.Success -> result.showMessage()
        is Result.Failed -> result.showMessage()
//        else -> {
//            println("there's no other possibilities") // the complier knows
//        }
    }
}
sealed class Result(val message: String) {
    fun showMessage() {
        println("Result : $message")
    }
    class Success(message: String): Result(message) {}
    class Failed(message: String): Result(message) {}
}

