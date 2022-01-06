private const val TEN = 10

private const val NINETY_NINE = 99

private const val HUNDRED = 100

private const val FOUR = 4

private const val THREE = 3

private const val NINE_HUNDRED_NINETY_NINE = 999

fun main() {
    // put your code here
    val num = readLine()!!.toInt()
    println(
        when {
            num < TEN -> 1
            num in TEN..NINETY_NINE -> 2
            num in HUNDRED..NINE_HUNDRED_NINETY_NINE -> THREE
            else -> FOUR
        }
    )
}
