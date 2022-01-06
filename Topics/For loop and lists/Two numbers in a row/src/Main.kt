fun main() {
    // write your code here
    val size = readLine()!!.toInt()
    val nums = MutableList(size) { readLine()!!.toInt() }
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    var neverAdjacent = "YES"

    for (i in 0 until nums.lastIndex) {
        if (nums[i] == a && nums[i + 1] == b ||
            nums[i] == b && nums[i + 1] == a
        ) {
            neverAdjacent = "NO"
        }
    }

    println(neverAdjacent)
}
