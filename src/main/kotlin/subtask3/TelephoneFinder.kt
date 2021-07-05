package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        var neighborArray: Array<String> = arrayOf()
        val interArray: MutableList<String> = ArrayList()
        val resultArray: Array<String>?
        val stringArray = number.toCharArray()
        if (number.toInt() < 0) resultArray = null
        else {
            for (element in stringArray) {
                when (element) {
                    '0' -> neighborArray = arrayOf("8")
                    '1' -> neighborArray = arrayOf("2", "4")
                    '2' -> neighborArray = arrayOf("1", "3", "5")
                    '3' -> neighborArray = arrayOf("2", "6")
                    '4' -> neighborArray = arrayOf("1", "5", "7")
                    '5' -> neighborArray = arrayOf("2", "4", "6", "8")
                    '6' -> neighborArray = arrayOf("3", "5", "9")
                    '7' -> neighborArray = arrayOf("4", "8")
                    '8' -> neighborArray = arrayOf("5", "7", "9", "0")
                    '9' -> neighborArray = arrayOf("6", "8")
                }
                for (i in neighborArray.indices) {
                    val tempTel = number.replace(element.toString(), neighborArray[i], true)
                    interArray.add(tempTel)
                }
            }
            resultArray = interArray.toTypedArray()
        }
        return resultArray
    }
}