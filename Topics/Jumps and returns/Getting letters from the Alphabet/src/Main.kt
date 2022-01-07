fun main() {
    // put your code here
    val letterUnwanted = readLine()!!.first()

    for (letter in 'a'..'z') {
        if (letter == letterUnwanted) return
        print(letter)
    }
}
