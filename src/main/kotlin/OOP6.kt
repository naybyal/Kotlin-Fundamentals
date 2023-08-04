//  late init keyword
fun main(args: Array<String>) {
    val stu1 = Student("Alex", "Dobbin", 22)
    stu1.favoriteSubject = "Computer Organization and Architecture"
    println(stu1.favoriteSubject)
//    if the variable is not initialized... accessing the var returns an exception. UninitializedPropertyAccessException
//    doesn't work with primitive types... only works with classes.
}

class Student (var firstName: String, var lastName: String, var age: Int) {
//    var favoriteSubject: String       this shows an error
    lateinit var favoriteSubject: String
//    to assign a value to a variable later.... for that we use lateinit keyword.

}