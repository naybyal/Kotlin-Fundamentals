//  classes

fun main(args: Array<String>) {
//    val car1 = Car()    //  An object has been instantiated. (an instance of the class is created / an object has been created)
//    car1.name = "Ford Mustang"
//    car1.model = "GT500"
//    car1.color = "Obsidian Blue"
//    car1.doors = 2
//
//    println("You have a ${car1.name} ${car1.model} of ${car1.color} shade with ${car1.doors} doors")
//    car1.move()
//    car1.stop()
//
//    println()
//
//    val car2 = Car()
//    car2.name = "Dodge Challenger"
//    car2.model = "SRT Demon 170"
//    car2.color = "Menacing Red"
//    car2.doors = 2;
//    println("You have a ${car2.name} ${car2.model} of ${car2.color} shade with ${car2.doors} doors")
//    car2.move()
//    car2.stop()
    var car1 = Car("Dodge Challenger", "SRT Demon 170", "Menacing Red", 2)
    println("You have a ${car1.name} ${car1.model} of ${car1.color} shade with ${car1.doors} doors")
    car1.move()
    car1.stop()
}

class Car(var name: String, var model: String, var color: String, var doors: Int) {

    fun move() {
        println("The $name is moving.")
    }

    fun stop() {
        println("The $name has stopped.")
    }
}