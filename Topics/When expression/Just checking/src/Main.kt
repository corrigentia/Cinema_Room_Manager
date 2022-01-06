private const val THREE = 3

private const val FOUR = 4

fun main() {
    // write your code here

    println(
        when (readLine()!!.toInt()) {
            1, THREE, FOUR -> "No!"
            2 -> "Yes!"
            else -> "Unknown number"
        }
    )
}
