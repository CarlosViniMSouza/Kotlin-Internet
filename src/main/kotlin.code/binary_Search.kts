fun binarySearch(list: List<Int>, key: Int): Int? {
    var rangeStart = 0
    var rangeEnd = list.count()

    while(rangeStart < rangeEnd){
        val midIndex = rangeStart + (rangeEnd - rangeStart)/2
        if(list[midIndex] == key) {
            return midIndex
        } else if(list[midIndex] < key) {
            rangeStart = midIndex + 1
        } else {
            rangeEnd = midIndex
        }
    }
    return null
}

val list = listOf(1, 4, 16, 64, 256)
val key = 2
val index = binarySearch(list, key)
if(key == null)
    print("element not found")
else
    print("element found at index $index")

// I dont know where is the error!