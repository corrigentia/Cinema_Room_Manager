fun main() {
    val input = readLine()!!
    // write code here
    println(
        when {
            input.isNotEmpty() && input.first() == 'i' -> input.drop(1).toInt() + 1
            input.isNotEmpty() && input.first() == 's' -> input.drop(1).reversed()
            else -> input
        }
    )
}
