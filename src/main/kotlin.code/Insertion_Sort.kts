fun insertionSort(items: MutableList<Int>): List<Int>{
    if(items.isEmpty()){
        return items
    }

    for(count in 1..items.count() - 1){
        val item = items[count]
        var i = count
        while(i > 0 && item < items[i - 1]){
            items[i] = items[i - 1]
            i -= 1
        }

        items[i] = item
    }

    return items
}

val list = mutableListOf(1, 3, 5, 7, 11, 13)
print("Sorted list: ${insertionSort(list)}")