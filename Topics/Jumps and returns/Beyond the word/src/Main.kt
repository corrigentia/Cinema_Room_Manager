fun main() {
    // put your code here
    val word = readLine()!!
    for (letter in 'a'..'z') {
        // if (letter !in word) print(letter)
        if (letter in word) continue
        print(letter)
    }
}
