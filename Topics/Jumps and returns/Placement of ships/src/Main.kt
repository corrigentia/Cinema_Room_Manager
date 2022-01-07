private const val FIELD_SIDE = 5
private const val SHIPS_PLACED = 3
private const val TAKEN_ROW_X = 0
private const val COLUMN = 1

fun main() {
    // put your code here
    val placements = MutableList(SHIPS_PLACED) { readLine()!!.split(" ").map { it.toInt() } }
    // println(placements)
    val emptyXrows = mutableListOf<Int>()
    val emptyYcolumns = mutableListOf<Int>()

    row@ for (givenRowX in COLUMN..FIELD_SIDE) {
        for (coordinates in placements.indices) {
            if (givenRowX == placements[coordinates][TAKEN_ROW_X]) continue@row
        }
        emptyXrows.add(givenRowX)
    }

    column@ for (givenColumnY in COLUMN..FIELD_SIDE) {
        for (coordinates in placements.indices) {
            if (givenColumnY == placements[coordinates][COLUMN]) continue@column
        }
        emptyYcolumns.add(givenColumnY)
    }

    println(emptyXrows.joinToString(" "))
    println(emptyYcolumns.joinToString(" "))
}
