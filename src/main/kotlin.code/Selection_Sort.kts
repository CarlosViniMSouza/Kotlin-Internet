fun selection_sort(sampleArray: IntArray){
    var n = sampleArray.size
    var temp: Int

    for(i in 0..n-1){
        var indexOfMin = i

        for(j in n-1 downTo i){

            if(sampleArray[j] < sampleArray[indexOfMin])
                indexOfMin = j
        }

        if(i != indexOfMin){
            temp = sampleArray[i]
            sampleArray[i] = sampleArray[indexOfMin]
            sampleArray[indexOfMin] = temp
        }
    }
}

println("\nBefore Sort: ")

var A = intArrayOf(10, 20, 30, 40, 50)

for(i in A) print(i)

selection_sort(A)
println("\nSorted Array is: ")

for(i in A) print(i)

/*
Output:

Before Sort:
1020304050
Sorted Array is:
1020304050
 */