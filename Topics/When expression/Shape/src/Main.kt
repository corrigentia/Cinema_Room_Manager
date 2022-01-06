const val CHOSEN = "You have chosen a "

private const val THREE = 3

private const val FOUR = 4

fun main(args: Array<String>) {
    // write your code here
    println(
        when (readLine()!!.toInt()) {
            1 -> CHOSEN + "square"
            2 -> CHOSEN + "circle"
            THREE -> CHOSEN + "triangle"
            FOUR -> CHOSEN + "rhombus"
            else -> "There is no such shape!"
        }
    )
}
