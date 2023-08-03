fun main(args: Array<String>) {
    val user = UserField("Alex")
    val friend = UserField("John", "Doe", 30)
    val dummy  = UserField("Dummy", "Man")
    println(); println()
    println("${user.name}${user.lastName}${user.age}\n")
    println("${friend.name}${friend.lastName}${friend.age}\n")
    println("${dummy.name}${dummy.lastName}${dummy.age}")
}

class UserField(var name: String, var lastName: String, var age: Int) {     //  primary constructor
//    secondary constructor 1
    constructor(name: String): this(name,"LastName",0) {
        println("second")
    }
//    secondary constructor 2
    constructor(name: String, lastName: String): this(name,lastName,0) {
        println("third")
    }
}