import kotlin.random.Random

fun doSomething(){
    println("Yes, all right")
}

fun doSomethingElse(){
    println("Oh No, try again")
}

val num = Random.nextBoolean()
val bool = if(num) null else Random.nextBoolean()

if (bool == true) {
    // bool is equal the TRUE:
    doSomething()
} else {
    // bool is equal the NULL:
    doSomethingElse()
}
// Output: <I dont know! You do need test over and over>