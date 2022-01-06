fun main() {
    // write your code here
    val (num1, op, num2) = readLine()!!.split(" ")
    val long1 = num1.toLong()
    val long2 = num2.toLong()

    println(
        when (op) {
            "+" -> long1 + long2
            "-" -> long1 - long2
            "/" -> if (long2 == 0L) "Division by 0!" else long1 / long2
            "*" -> long1 * long2
            else -> "Unknown operator"
        }
    )
}
