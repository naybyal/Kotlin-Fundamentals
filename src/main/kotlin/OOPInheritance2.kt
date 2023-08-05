fun main(args: Array<String>) {
    val newView = View()
    newView.draw()
    val newButton = Button("Login", "Horizontal")
    println(newButton.orientation); println(newButton.text)
    newButton.draw()
    val roundedBtn = RoundedButton("Sign up!", "Horizontal", 4)
    roundedBtn.draw()
    println("${roundedBtn.corners}\t${roundedBtn.text}\t${roundedBtn.orientation}")
}

open class View() {

    open fun draw() {
        println("Test : Drawing the view.")
    }

}

open class Button(val text: String, var orientation: String): View() {

    override fun draw() {
        println("Test : Drawing a button.")
//        super.draw()
    }

}

class RoundedButton(text: String, orientation: String, val corners: Int): Button(text, orientation) {
    override fun draw() {
        println("Test : Drawing a rounded button")
//        super.draw()
    }
}