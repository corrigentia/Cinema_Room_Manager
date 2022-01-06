fun main() {
    // write your code here
    val howMany = readLine()!!.toInt()
    val numberList = MutableList(howMany) { readLine()!!.toInt() }

    println(numberList.indexOf(numberList.sortedDescending().first()))
}
