private const val TWO = 2
const val RATE_OF_DESCENT = 9.8

fun main() {
    // write your code here
    val (liquidDensity, columnHeight) = MutableList(TWO) { readLine()!!.toDouble() }
    println(liquidDensity * columnHeight * RATE_OF_DESCENT)
}
