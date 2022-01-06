const val THREE = 3

fun main() {
    // write your code here
    val simplerCube = MutableList(THREE) { MutableList(THREE) { MutableList(THREE) { 0 } } }
    val mutList3D = mutableListOf(
        mutableListOf(mutableListOf(0, 0, 0), mutableListOf(0, 0, 0), mutableListOf(0, 0, 0)),
        mutableListOf(mutableListOf(0, 0, 0), mutableListOf(0, 0, 0), mutableListOf(0, 0, 0)),
        mutableListOf(mutableListOf(0, 0, 0), mutableListOf(0, 0, 0), mutableListOf(0, 0, 0))
    )

    // println(simplerCube == mutList3D)

    println(simplerCube)
}
