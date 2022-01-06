const val HUNDRED_FLOAT = 100.0F

fun main() {
    // write your code here
    // hyperskill-15027-test-03
    /*
3
.
50
100
300
.
100
20
0
.
50 * 100% = 50
100 * 20% = 20
300 * 0%  =  0
     */
    val howMany = readLine()!!.toInt()
    val companyList = MutableList(howMany) { readLine()!!.toFloat() }
    val percentageList = MutableList(howMany) { readLine()!!.toFloat() }

    // println("percentageList: $percentageList")

    val taxList = mutableListOf<Float>()

    for (i in companyList.indices) {
        /*
        println(companyList[i])
        println(companyList[i] / 100)
        println(percentageList[i])
         */
        taxList.add(companyList[i] * percentageList[i] / HUNDRED_FLOAT)
    }

    // println(taxList)

    println(taxList.indexOf(taxList.maxOrNull()) + 1)
}
