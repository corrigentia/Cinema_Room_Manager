import kotlin.math.pow

private const val ONE = 1

private const val THREE = 3

fun main() {
    // put your code here
    val x = readLine()!!.toDouble()
    println(
        ONE + x + x.pow(2) + x.pow(THREE)
    )
}
