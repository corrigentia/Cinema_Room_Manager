fun main() {
    // write your code here
    val howMany = readLine()!!.toInt()
    val numberList = MutableList(howMany) { readLine()!!.toInt() }
    val placesToShiftRight = readLine()!!.toInt() % howMany

    repeat(placesToShiftRight) {
        numberList.add(0, numberList.last())
        numberList.removeAt(numberList.lastIndex)
    }

    println(numberList.joinToString(" "))
}
