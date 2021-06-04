println("Writing any number int: ")
val num = readLine()?.toInt()
var temp1 = 0
var temp2 = 1

print("First $num terms: ")
if(num != null)
    for(i in 1..num){
        print("$temp1")

        val sum = temp1 + temp2
        temp1 = temp2
        temp2 = sum
    }

// Input: 5 --> Output: 01123   //something is wrong!