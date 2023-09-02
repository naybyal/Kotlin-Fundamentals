fun main(args: Array<String>) {

}

abstract class VehicleNew {
    //  can only be inherited by other classes....
    //  similar to interface...
    val text = "some text"  // in interface, we cannot do this.
    abstract fun move();
    abstract fun stop();
}
// we can only inherit from a single class.. but inherit from many interfaces (DIAMOND PROBLEM just like in Java)
class NewCar(var name: String, var color: String, val engines: Int, val doors: Int): Vehicle() {
    override fun move() {
        super.move()
        println("$name moves.")
    }

    override fun stop() {
        super.stop()
        println("$name stops.")
    }
}