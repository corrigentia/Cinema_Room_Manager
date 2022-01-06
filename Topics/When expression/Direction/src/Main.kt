private const val FOUR = 4
const val MOVE = "move"
private const val THREE = 3
fun main() {
    // write your code here
    println(
        when (readLine()!!.toInt()) {
            1 -> "$MOVE up"
            2 -> "$MOVE down"
            THREE -> "$MOVE left"
            FOUR -> "$MOVE right"
            0 -> "do not $MOVE"
            else -> "error!"
        }
    )
}
