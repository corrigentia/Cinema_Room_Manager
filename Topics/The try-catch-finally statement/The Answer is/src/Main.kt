private const val FORTY_TWO = 42

fun main() {
    val answer: Int = try {
        readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        FORTY_TWO
    } finally {
        println("The answer is a number")
    }
    println(answer)
}
