fun linearSearch(list: List<Int>, key:Int): Int?{
    for((index, value) in list.withIndex()){
        if(value == key) return index
    }
    return null
}

val list = listOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
val key = 9
val index = linearSearch(list, key)
if(index == null)
    print("Element not found")
else
    print("Element found in $index")

/*
Output: Element found in 4
 */