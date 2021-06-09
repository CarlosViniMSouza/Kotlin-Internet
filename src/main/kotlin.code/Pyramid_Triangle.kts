val rows = 8
var a = 0
var b = 0
var c = 0

for(i in 1..rows) {

    for(j in 1..rows - i) {
        print("   ")
        ++b
    }

    while(a != 2*i - 1) {
        if(b <= rows - 1) {
            print((i + a).toString() + "  ")
            ++b
        } else {
            ++c
            print((i + a - 2*c).toString() + "  ")
        }
        ++a
    }

    a = 0
    b = a
    c = b
    println()
}

/*
Output:

                     1
                  2  3  2
               3  4  5  4  3
            4  5  6  7  6  5  4
         5  6  7  8  9  8  7  6  5
      6  7  8  9  10  11  10  9  8  7  6
   7  8  9  10  11  12  13  12  11  10  9  8  7
8  9  10  11  12  13  14  15  14  13  12  11  10  9  8

 */