fun getLargestElement(data: Array<Int>): String {
    var location = 0
    var maxNumber = data[location]

    data.sortedArray().forEach { number ->
        if (maxNumber < number) {
            maxNumber = number
            location = data.indexOf(maxNumber)
        }
    }
    return "The index of largest element is: $location \nThe element is: $maxNumber"
}
