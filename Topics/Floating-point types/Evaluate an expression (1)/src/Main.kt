private const val FOUR = 4

private const val TEN_HALF = 10.5

private const val FOUR_FOUR = 4.4

private const val TWO_TWO = 2.2

fun main() {
    // put your code here
    val (a, b, c, d) = MutableList(FOUR) { readLine()!!.toDouble() }
    println(a * TEN_HALF + b * FOUR_FOUR + (c + d) / TWO_TWO)
}
