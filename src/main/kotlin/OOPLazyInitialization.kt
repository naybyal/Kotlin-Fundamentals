fun main(args: Array<String>) {
    val user1 = User("Alex", "Chance", 29)
//    to initialize using lazy intializer..

    val user2 by lazy {
        User("Angela","White",37)
    }
//    the object is not initialized.
//    unless it's used.
    println(user2.firstName)    //  now the initializer block has been initialized
}

class User(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User : $firstName was created")
    }
}