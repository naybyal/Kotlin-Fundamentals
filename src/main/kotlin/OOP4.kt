fun main(args: Array<String>) {
    var ak = Dog("Chaverpatti")
    println("${ak.name} ${ak.breed} ${ak.numberOfLegs}")
}

class Dog(var breed: String, var numberOfLegs: Int = 4, var name: String="korayan") {

}