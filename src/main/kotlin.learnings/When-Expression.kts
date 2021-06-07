fun describe(number: Number): String =
    when(number){
        0, 0L, 0.0, 0.0F -> "Zero"
        in 1..Int.MAX_VALUE -> "Positive Integer"
        is Double, is Float -> "Something"
        else -> "I dont know! LOL"
    }

println(describe(0L))
println(describe(50))
println(describe(0.15F))
println(describe(-5L))
/*Output:
Zero
Positive Integer
Something
I dont know! LOL
 */