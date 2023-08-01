fun main(args: Array<String>) {
//    cannot assign any variable by default as null
//    val text: String = null  {This won't work}
    var text: String? = null // won't give a NullPonterException
    println(text)
    var text2: String? = "Name"
//    text2 = null
//    println(text2.length)     Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    if (text2 != null)
            println(text2.length)
    else    println("The variable is null")
    println(text2?.length)      // equivalent to the if-else statement above

//    inorder to get the NullPointerException
//    println(text!!.length)

    var text3 = text ?: "Some text"     // if the text is not null, assign what's on the right.
    println(text3)

//    assigning not null value to text
    text = "Something"
    text3 = text ?: "Some text"
    println(text3)


//    the above implementation goes like...
    text = null         // to visualize, change the text to null or some String
    if (text != null)   text3 = text
    else    text3 = "Some text"
    println(text3)
}