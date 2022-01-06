import kotlin.math.pow
import kotlin.math.sqrt

private const val PI = 3.14

fun main() {
    // write your code here
    val shape = readLine()!!
    var (a, b, c, r) = mutableListOf(0.0, 0.0, 0.0, 0.0)

    if (shape == "triangle") {
        a = readLine()!!.toDouble()
        b = readLine()!!.toDouble()
        c = readLine()!!.toDouble()
    } else {
        if (shape == "rectangle") {
            a = readLine()!!.toDouble()
            b = readLine()!!.toDouble()
        } else {
            if (shape == "circle") {
                r = readLine()!!.toDouble()
            }
        }
    }

    var area = 0.0

    when (shape) {
        "triangle" -> {
            val perimeter = a + b + c
            val semiperimeter = perimeter / 2.0
            area = sqrt(
                semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c)
            )
        }
        "rectangle" -> area = a * b
        "circle" -> area = PI * r.pow(2)
    }

    println(area)
}
