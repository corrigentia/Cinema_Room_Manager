const val THREE = 3

fun main() {
    // put your code here
    val (a, b, c) = MutableList(THREE) { readLine()!!.toFloat() }
    println((c - b) / a)
}
