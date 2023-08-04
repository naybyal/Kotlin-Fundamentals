//  A singleton is a design pattern in Kotlin in which we wanna have one instance of a particular object
//  we want that instance to be available globally
//  Practical reasons : databases : mulitple instances can cause multiple databases, which causes resource overhead
//  Solution : create only one
fun main(args: Array<String>) {
//    val instance = Database.getInstance()
//    println(instance)
    println(Database)
    println(Database)
    println(Database)
    println(Database)
//    calls initializer block only once.
}

//class Database private constructor() {
////    cannot access any entities of this class as it's private...
////    but companion objects can facilitate that
//    companion object {
//        private var instance: Database? = null
//
//        fun getInstance(): Database? {
//            if (instance == null)   {
//                instance = Database()
//            }
//            return instance
//        }
//    }
//}

//  creating a singleton using an object keyword
object Database {
    init {
        println("Database created.")
    }
}