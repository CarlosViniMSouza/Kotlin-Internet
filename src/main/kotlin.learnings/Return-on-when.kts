/**************
Return on when
 *************/

package docs.basics.idoms

fun Int.toFullString() = when (this) {
    0 -> "Zero"
    1 -> "One"
    2 -> "Two"
    else -> "negative or bigger than two"
}

fun main(){
    println((1).toFullString())

    println((2).toFullString())
}