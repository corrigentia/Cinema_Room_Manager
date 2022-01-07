fun main() {
    // put your code here
    val secret = readLine()!!

    for (char in secret) {
        // if (char.isDigit()) return println(char)
        if (char.isDigit()) {
            println(char)
            break
        }
    }
}
