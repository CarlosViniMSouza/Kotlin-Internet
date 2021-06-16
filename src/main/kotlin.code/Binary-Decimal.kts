val num:  Long = 110110101
val decimal = convertBinaryToDecimal(num)
println("$num is binary = $decimal in decimal")

fun convertBinaryToDecimal(num: Long): Int {
    var num = num
    var decimalNumber = 0
    var i = 0
    var rem: Long

    while(num.ToInt() != 0){
        rem = num % 10
        num /= 10
        decimalNumber += (rem * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}