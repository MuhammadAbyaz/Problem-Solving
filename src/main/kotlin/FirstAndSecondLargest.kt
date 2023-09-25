fun firstAndSecondLargest(array: Array<Int>): String {
    val result: String
    var temp: Int = array[0]
    var firstLargest: Int = 0
    var secondLargest: Int = 0

    array.forEach { number ->
        if (number > temp && number > firstLargest) {
            firstLargest = number
        } else if (number in (temp + 1)..<firstLargest && number > secondLargest) {
            secondLargest = number
        }
    }
    result = "First largest number is: $firstLargest\nSecond largest number is: $secondLargest"
    return result
}