//  basics for variables

fun main(args: Array<String>) {
    val userName: String = "naybyal"
    val x = 2.001
    println("Hello $userName!")
//    println(x)
    println()
//    byte short int long float double
    val minByteValue: Byte = Byte.MIN_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE
    println("Byte: Max = $maxByteValue\tMin = $minByteValue")

    val minShortValue: Short = Short.MIN_VALUE
    val maxShortValue: Short = Short.MAX_VALUE
    println("Short: Max = $maxShortValue\tMin = $minShortValue")

    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    println("Integer : Max = $maxIntegerValue\tMin = $minIntegerValue")

    val maxLongValue: Long = Long.MAX_VALUE
    val minLongValue: Long = Long.MIN_VALUE
    println("Long : Max = $maxLongValue\tMin = $minLongValue")

    val maxFloatValue: Float = Float.MAX_VALUE
    val minFloatValue: Float = Float.MIN_VALUE
    println("Float : Max = $maxFloatValue\tMin = $minFloatValue")

    val maxDoubleValue: Double = Double.MAX_VALUE
    val minDoubleValue: Double = Double.MIN_VALUE
    println("Double : Max = $maxDoubleValue\tMin = $minDoubleValue")

//    char and boolean
    val myCharValue: Char = 'x'
    val isReadableValue: Boolean = true

    println("Character and isReadable : $myCharValue \t $isReadableValue")
}