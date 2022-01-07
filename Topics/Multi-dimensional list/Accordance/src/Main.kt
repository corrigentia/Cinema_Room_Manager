private const val THREE = 3

fun main() {
    // put your code here
    /*
    val mutList2D = mutableListOf(
        mutableListOf("[0][0]", "[0][1]", "[0][2]"), mutableListOf("[1][0]", "[1][1]", "[1][2]")
    )
     */

    val mutList2by3 = MutableList(2) { MutableList(THREE) { "" } }

    for (row in mutList2by3.indices) {
        for (column in mutList2by3[row].indices) {
            mutList2by3[row][column] = "[$row][$column]"
        }
    }

    println(
        /*
        """
        [[[0][0], [0][1], [0][2]], [[1][0], [1][1], [1][2]]]
        """.trimIndent()
        */
        // mutList2D
        // mutList2D === mutList2by3
        // mutList2D == mutList2by3
        mutList2by3
    )
}
