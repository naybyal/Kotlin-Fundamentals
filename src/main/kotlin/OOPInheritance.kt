fun main(args: Array<String>) {
    val car = SuperCar("BMW 530d","Grey",6,4)
    val plane = Plane("Boeing","White", 12,4)

    car.move()
    plane.move()
    car.stop()
    plane.stop()

//    move and stop functions are now part of the SuperCar and Plane classes
//    if we want another versions of these functions, specific to the class, we'll have to override the functions
//    this is done by using the open keyword on the required functions in the super class and
//    override keyword on the functions in the child class
}

//class SuperCar(val name: String, val color: String, val cylinders: Int, val doors: Int) {
//
//    fun move() {
//        println("$name is moving.")
//    }
//
//    fun stop() {
//        println("$name has stopped.")
//    }
//
//}

//class Plane(val name: String, val color: String, val cylinders: Int, val doors: Int) {
//
//    fun move() {
//        println("$name is moving.")
//    }
//
//    fun stop() {
//        println("$name has stopped.")
//    }
//
//}

//  the functions and parameters are all the same... hence code has been duplicated...
//  this can be avoided by inheriting methods and variables from the super class

open class Vehicle (val name: String, val color: String) {

    open fun move() {
        println("$name is moving.")
    }

    open fun stop() {
        println("$name has stopped.")
    }

}
//  here our super class is Vehicle, and we can now define the classes SuperCar and Plane

class SuperCar(name: String, color: String, val cylinders: Int, val doors: Int): Vehicle(name,color) {}

class Plane(name: String, color: String, val cylinders: Int, val doors: Int): Vehicle(name,color) {
    override fun move() {
        println("$name is flying")
    }
    override fun stop() {
        println("$name has landed.")
    }
}

//  use open keyword to inherit