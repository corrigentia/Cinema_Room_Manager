fun main() {
    // write your code here
    val size = readLine()!!.toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until size) {
        mutList.add(readLine()!!.toInt())
    }

    val standard = readLine()!!.toInt()
    var occurrences = 0

    for (given in mutList) {
        if (given == standard) occurrences++
    }

    println(occurrences)
}
