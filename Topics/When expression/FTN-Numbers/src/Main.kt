private const val THREE = 3

private const val TEN = 10

private const val HUNDRED = 100

private const val THOUSAND = 1_000

private const val TENTHOUSAND = 10_000

private const val HUNDREDTHOUSAND = 100_000

private const val FIFTYFIVE = 55

private const val FORTYFIVE = 45

private const val THIRTYFOUR = 34

private const val THIRTYSIX = 36

private const val TWENTYEIGHT = 28

private const val TWENTYONE = 21

private const val FIFTEEN = 15

private const val THIRTEEN = 13

private const val EIGHT = 8

private const val SIX = 6

private const val FIVE = 5

fun main() {
    // put your code here

    println(
        when (readLine()!!.toInt()) {
            in mutableListOf(0, 1, 2, THREE, FIVE, EIGHT, THIRTEEN, TWENTYONE, THIRTYFOUR, FIFTYFIVE) -> "F"
            in mutableListOf(0, 1, THREE, SIX, TEN, FIFTEEN, TWENTYONE, TWENTYEIGHT, THIRTYSIX, FORTYFIVE) -> "T"
            in mutableListOf(1, TEN, HUNDRED, THOUSAND, TENTHOUSAND, HUNDREDTHOUSAND) -> "P"
            else -> "N"
        }
    )
}
