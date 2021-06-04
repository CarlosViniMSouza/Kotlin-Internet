/**********************
*   First or Null     *
**********************/

fun main(){
    /**Empty List**/
    val list1 = listOf<Any>()
    val check1 = list1.firstOrNull()
    println(check1)
    // Output: null

    /**Non-Empty List**/
    val list2 = listOf(10, 5, 2.5)
    val check2 = list2.firstOrNull()
    println(check2)
    // Output: 1
}

/**Empty List**/
val list1 = listOf<Any>()
val check1 = list1.firstOrNull()
println(check1)
// Output: null !!

/**Non-Empty List**/
val list2 = listOf(1, 3, 5)
val check2 = list2.firstOrNull()
println(check2)
// Output: unknown...