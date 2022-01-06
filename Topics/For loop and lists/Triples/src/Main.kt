fun main() {
    // write your code here
    val howMany = readLine()!!.toInt()
    val numberList = MutableList(howMany) { readLine()!!.toInt() }
    var triples = 0
    // val tripleList = mutableListOf<Int>()

    for (i in 0 until numberList.lastIndex - 1) {
        if (numberList[i] + 1 == numberList[i + 1] && numberList[i] + 2 == numberList[i + 2]) {
            triples++
            /*
            tripleList.add(numberList[i])
            tripleList.add(numberList[i + 1])
            tripleList.add(numberList[i + 2])
             */
        }
    }

    println(triples)
    // println(tripleList)
}
