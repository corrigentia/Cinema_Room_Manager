private const val FOUR = 4

private const val FIVE = 5

private const val NINE = 9

private const val TEN = 10

private const val NINETEEN = 19

private const val TWENTY = 20

private const val FORTYNINE = 49

private const val FIFTY = 50

private const val HUNDRED = 100

private const val TWOHUNDREDFIFTY = 250

private const val FIVEHUNDRED = 500

private const val NINEHUNDREDNINETYNINE = 999

private const val FOURHUNDREDNINETYNINE = 499

private const val NINETYNINE = 99

private const val TWOHUNDREDFORTYNINE = 249

fun main() {
    // write your code here
    val units = readLine()!!.toInt()

    println(
        when {
            units < 1 -> "no army"
            units in 1..FOUR -> "few"
            units in FIVE..NINE -> "several"
            units in TEN..NINETEEN -> "pack"
            units in TWENTY..FORTYNINE -> "lots"
            units in FIFTY..NINETYNINE -> "horde"
            units in HUNDRED..TWOHUNDREDFORTYNINE -> "throng"
            units in TWOHUNDREDFIFTY..FOURHUNDREDNINETYNINE -> "swarm"
            units in FIVEHUNDRED..NINEHUNDREDNINETYNINE -> "zounds"
            else -> "legion"
        }
    )
}
