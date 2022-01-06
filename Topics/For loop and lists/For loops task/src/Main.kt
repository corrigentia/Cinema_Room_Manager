fun main() {
    // write your code here
    val howMany = readLine()!!.toInt()
    val numberList = MutableList(howMany) { readLine()!!.toInt() }
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    var bothPresent = "NO"
    if (a in numberList && b in numberList) bothPresent = "YES"
    println(bothPresent)
}
