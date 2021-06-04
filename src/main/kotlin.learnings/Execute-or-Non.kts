/*******************
Execute if not null
*****************/

// Expression body + safe call(?.)

fun printIfNotNull(i: Int?) = i?.let{
    println(it)
}

printIfNotNull(-5)
// Output: -5

printIfNotNull(5)
// Output: 5

// And in final: kotlin.Unit