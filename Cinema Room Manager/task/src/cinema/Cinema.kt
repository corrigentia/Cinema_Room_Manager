package cinema

import java.lang.IndexOutOfBoundsException
import java.util.Locale

const val FRONT_HALF_PRICE = 10
const val BACK_HALF_PRICE = 8

private const val SIXTY = 60
private const val THREE = 3

fun main() {
    val ticketsPurchased = 0
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seatsPerRow = readLine()!!.toInt()
    println()

    val cinemaSeating = MutableList(rows) { MutableList(seatsPerRow) { "S" } }

    var header = "  "
    for (col in 1..seatsPerRow) {
        header += "$col "
    }

    val seats = rows * seatsPerRow

    // var potentialIncome = seats * FRONT_HALF_PRICE
    val frontHalf = rows / 2

    val backHalf = rows - frontHalf
    val frontIncome = frontHalf * seatsPerRow * FRONT_HALF_PRICE
    val backIncome = backHalf * seatsPerRow * BACK_HALF_PRICE

    val potentialIncome: Int = frontIncome + backIncome
    val actualIncome = 0

    menu(header, cinemaSeating, seats, frontHalf, ticketsPurchased, actualIncome, potentialIncome)
}

private fun menu(
    header: String,
    cinemaSeating: MutableList<MutableList<String>>,
    seats: Int,
    frontHalf: Int,
    ticketsPurchased: Int,
    actualIncome: Int,
    potentialIncome: Int
) {
    do {
        println()
        println(
            """
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
            """.trimIndent()
        )
        val choice = readLine()!!.toInt()
        when (choice) {
            1 -> showTheSeats(header, cinemaSeating)
            2 -> buyAticket(cinemaSeating, seats, frontHalf, ticketsPurchased, actualIncome, header, potentialIncome)
            THREE -> statistics(ticketsPurchased, potentialIncome, actualIncome, seats)
        }
    } while (choice != 0)
}

private const val HUNDRED_2_DECIMALS = 100.00

private fun statistics(ticketsPurchased: Int, potentialIncome: Int, actualIncome: Int, seats: Int) {

    val occupancyPercentage = 0.00 + ticketsPurchased.toDouble() / seats.toDouble() * HUNDRED_2_DECIMALS
    /* val occupancyPercentage =
    DecimalFormat("#.##").format(0.00 + ticketsPurchased.toDouble() / seats.toDouble() * HUNDRED_2_DECIMALS) */
    /* val occupancyPercentage =
        { DecimalFormat("#.##").format(0.00 + ticketsPurchased.toDouble() / seats.toDouble() * HUNDRED_2_DECIMALS) } */

    println()
    /*
    println(
        "occupancyPercentage $occupancyPercentage " +
                "seats $seats " +
                "ticketsPurchased $ticketsPurchased " +
                "HUNDRED_2_DECIMALS $HUNDRED_2_DECIMALS " +
                DecimalFormat("#.##").format(occupancyPercentage) + " " +
                String.format("%.2f", occupancyPercentage)
    )
    */
    println(
        """
Number of purchased tickets: $ticketsPurchased
Percentage: ${String.format(Locale.US, "%.2f", occupancyPercentage)}%
Current income: $$actualIncome
Total income: $$potentialIncome
        """.trimIndent()
    )
    println()
}

private fun buyAticket(
    cinemaSeating: MutableList<MutableList<String>>,
    seats: Int,
    frontHalf: Int,
    ticketsPurchasedTmp: Int,
    actualIncomeTmp: Int,
    header: String,
    potentialIncome: Int
) {

    try {

        do {

            println()
            println("Enter a row number: \n> ")
            val rowNum = readLine()!!.toInt()
            println("Enter a seat number in that row: \n> ")
            val seatInRow = readLine()!!.toInt()
            val rowIndex = rowNum - 1
            val seatIndex = seatInRow - 1
            /*
            println(
                "rowIndex $rowIndex " +
                    "cinemaSeating $cinemaSeating " +
                    "cinemaSeating.indices ${cinemaSeating.indices} " +
                    "seatIndex $seatIndex " +
                    "cinemaSeating[rowIndex] ${cinemaSeating[rowIndex]} " +
                    "cinemaSeating[rowIndex].indices ${cinemaSeating[rowIndex].indices}"
            )
             */

            if ((rowIndex !in cinemaSeating.indices) || (seatIndex !in cinemaSeating[rowIndex].indices)) {
                println("Wrong input!")
            } else if (cinemaSeating[rowIndex][seatIndex] == "B") {
                println("That ticket has already been purchased!")
            } else {

                cinemaSeating[rowIndex][seatIndex] = "B"

                var ticketPrice = FRONT_HALF_PRICE
                if (seats > SIXTY) {
                    if (rowNum > frontHalf) ticketPrice = BACK_HALF_PRICE
                }

                /*
                println("Total income:")
                println("\$$potentialIncome")
                 */

                var ticketsPurchased = ticketsPurchasedTmp
                ticketsPurchased++
                var actualIncome = actualIncomeTmp
                actualIncome += ticketPrice
                println("Ticket price: \$$ticketPrice\n")
                menu(header, cinemaSeating, seats, frontHalf, ticketsPurchased, actualIncome, potentialIncome)
            }
        } while (cinemaSeating[rowIndex][seatIndex] == "B")
    } catch (e: IndexOutOfBoundsException) {
        /* no-op */
    }
}

private fun showTheSeats(header: String, cinemaSeating: MutableList<MutableList<String>>) {

    println()
    println("Cinema:")
    println(header)

    for (out in cinemaSeating.indices) {
        print("${out + 1} ")
        println(cinemaSeating[out].joinToString(" "))
    }

    println()
}
