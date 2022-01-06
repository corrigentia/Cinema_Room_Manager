fun main() {
    // write your code here
    val size = readLine()!!.toInt()
    val nums = MutableList(size) { readLine()!!.toInt() }
    val given = readLine()!!.toInt()
    var numberInSet = "NO"

    if (given in nums) numberInSet = "YES"

    println(numberInSet)
}
