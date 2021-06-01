fun main(){
    val rows = 6
    var c = 1

    for(i in 0..rows-1){
        for(space in 1..rows-i-1){
            print(" ")
        }

        for(j in 0..i){
            if(j == 0 || i ==0)
                c = 1
            else
                c = c * (i-j+1)/j

            System.out.printf("%4d", c)
        }

        println()
    }
}