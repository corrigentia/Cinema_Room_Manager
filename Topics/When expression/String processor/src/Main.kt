const val THREE = 3

fun main() {
    // write your code here
    val (s1, op, s2) = MutableList(THREE) { readLine()!! }

    println(
        when (op) {
            "equals" -> s1 == s2
            "plus" -> s1 + s2
            "endsWith" -> s1.endsWith(s2)
            else -> "Unknown operation"
        }
    )
}