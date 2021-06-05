val list = listOf(1, 2, 3, 4)

println(list[1])
//Output: 2

/**Mutable List**/
val mutableList = mutableListOf(1, 3, 9)
mutableList.add(27)
println(mutableList)
//Output: [1, 3, 9, 27]

/**Traversing**/
for(i in list){
    print(i)
}
//Output: 1234