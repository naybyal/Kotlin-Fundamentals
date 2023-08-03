fun main(args: Array<String>) {
//    LOOPS
   for (i in 1..10)    //  i in range 1 to 10  (will include 10)
       println("i = $i")

   for (i in 1 until 10)   //  will exclude 10     // CAN ONLY COUNT UPWARDS ("10 until 1 is not possible")
       println(i)

   for (i in 10 downTo 1)
       println(i)

   for (i in 1 until 10 step 2)    // skips second iteration
       println(i)

//    while loop
   var num = 0
   while (num<10) println(++num)

//    do-while loop
   do {
       println(++num)
   } while (num<10)

//    continue and break statements
    var number = 0
   while (number < 10) {
       if (number == 7)
           continue    //  creates an infinite loop
       println(number++)
   }
   solution to the above problem...
   number = 0
   while (number < 10) {
       number++
       if (number == 7)    continue
       println(number)
   }
   number = 0
   while (number < 10) {
       number++
       if (number == 7)    break   //  loop breaks at number = 7
       println(number)
   }

//    labels
    number = 0

    outer@ while (number < 5) {
        number++
        println(number)

        var i=0
        while (i<5) {
            if (i == 0) break@outer // breaks the outer loop
            i++
            println("***$i")
        }
    }
}
