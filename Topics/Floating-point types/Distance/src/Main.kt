const val TWO = 2

fun main() {
    // put your code here
    val (distance, duration) = MutableList(TWO) { readLine()!!.toDouble() }
    println(distance / duration)
}
