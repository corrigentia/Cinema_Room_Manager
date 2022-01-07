fun main() {
    // put your code here
    val word = readLine()!!
    var uniqueChars = 0

    outer@ for (left in word.indices) {
        for (right in word.indices) {
            if (word[left] == word[right] && left != right) continue@outer
        }
        uniqueChars++
    }

    println(uniqueChars)
}
