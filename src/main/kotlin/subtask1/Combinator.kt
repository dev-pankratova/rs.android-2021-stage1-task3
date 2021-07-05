package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var x: Int?
        x = 1
        val m = array[0]
        val n = array[1]
        var k: Int
        if (m >= 0 && n > 0) {

            fun factorial(f: Int): Long {
                var resultF: Long = 1
                for (i in 1..f) {
                    resultF *= i
                }
                return resultF
            }

            do {
                val z = n - x!!
                if (z != 0) {
                    k = (factorial(n) / (factorial(x) * factorial(z))).toInt()
                    if (k == m) break
                    else x += 1
                } else {
                    x = null
                    break
                }
            } while (k != m)
        }
        return x
    }
}
