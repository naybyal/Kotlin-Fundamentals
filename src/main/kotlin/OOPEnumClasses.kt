fun main(args: Array<String>) {
//    enums are used in if or when statement expressions

//    Accessing enum values
//    println(Direction.EAST)
//    println(Direction.WEST)
//    println(Direction.NORTH)
//    println(Direction.SOUTH)

//    looping through the enum values...
//    for (direction in Direction.values())
//        println(direction)  //  in the order they are defined in the enum class
//    accessing values...
    println(Direction.NORTH.name)   // name is variable that's built in in the class
    println(Direction.NORTH.direction)
    println(Direction.NORTH.distance)
    println(Direction.NORTH.ordinal)    //  built in variable too

    Direction.WEST.printData()

//    val direction = Direction.EAST
    val direction = Direction.valueOf("east".uppercase())
    when (direction) {
        Direction.EAST -> {
            println("The direction is East")
        }
        Direction.WEST -> println("The direction is West")
        Direction.NORTH -> println("The direction is North")
        Direction.SOUTH -> println("The direction is South")
    }

//    var dir = Direction.valueOf("East".uppercase())
}

enum class Direction(var direction: String, var distance: Int) {
//    here we define the enum values...
    NORTH("North",10),
    SOUTH("South",20),
    EAST("East", 15),
    WEST("West", 40);   //  provide a semicolon for the last one if fun are declared

    fun printData() {
        println("Direction : $direction, Distance : $distance m")
    }
}