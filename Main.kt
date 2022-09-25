import java.util.*

fun main() {

    val t = readLine()!!.split(" ")[0].toInt()
    for (i in 0 until t) {
        val l = readLine()
        val n = l!!.split(" ")[0].toInt()
        val m = l!!.split(" ")[1].toInt()
        var el = n * m
        val arr: Array<IntArray> = Array(n) {IntArray(m){0} }
        for (c in 0 until n + m - 1) {
            var i = 0
            var j = 0
            var times = 0
            if (c < n) {
                i = c
                j = 0
            }
            else {
                i = n - 1
                j = c - i
            }
            times = when (i < m - j - 1){
                true -> i
                else -> m - j - 1
            }
            arr[i][j] = el
            el -= 1
            for (time in 0 until times ) {
                i -= 1
                j += 1
                arr[i][j] = el
                el -= 1
            }
        }
        for (i in arr) {
            for (j in i) {
                print(j)
                print(" ")
            }
            println()
        }
    }
}

