const val TWO = 2

fun main() {
    // put your code here
    val (a, b) = MutableList(TWO) { readLine()!!.toDouble() }
    println(b - a)
}
