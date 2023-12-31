//    getters and setters;  encapsulation;
fun main(args: Array<String>) {
    val emp1 = Employee("Alex")
    val emp2 = Employee("John", "Doe")
    val emp3 = Employee(age = 21, firstName = "Rosetta", lastName = "Stoned")

    println("EMPLOYEE 1 :  ${emp1.firstName} ${emp1.lastName} ${emp1.age}")
    println("EMPLOYEE 2 :  ${emp2.firstName} ${emp2.lastName} ${emp2.age}")
    println("EMPLOYEE 3 :  ${emp3.firstName} ${emp3.lastName} ${emp3.age}")

    emp3.firstName = "Vlad"
}

class Employee(firstName: String, var lastName: String = "last-name", var age: Int = 0) {
    var firstName = firstName
//        redundant code;   auto-generated by KOTLIN
        get() {
            return "First Name : $field"
        }
//        This can also simply be written as...
//        get() = field
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
}