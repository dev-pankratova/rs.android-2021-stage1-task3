package subtask2

class SquareDecomposer {

    private fun decomposer(number: Long, remain: Long): ArrayList<Long>? {
        if (remain == 0L) {
            val list = ArrayList<Long>()
            list.add(number)
            return list
        }

        for (i in number - 1 downTo 0) {
            if ((remain - i * i) >= 0) {
                val list = decomposer(i, (remain - i * i))
                if (list != null) {
                    list.add(number)
                    return list
                }
            }
        }
        return null
    }

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 0) return null
        else {
            val numToLong = number.toLong()
            val decomposeArray = decomposer(numToLong, numToLong * numToLong)
            val findArray = mutableListOf<Int>()

            if (decomposeArray != null) {
                decomposeArray.removeAt(decomposeArray.size - 1)

                for (i in decomposeArray) {
                    val value = i.toInt()
                    findArray.add(value)
                }
                return findArray.toTypedArray()
            }
            return null
        }
    }
}