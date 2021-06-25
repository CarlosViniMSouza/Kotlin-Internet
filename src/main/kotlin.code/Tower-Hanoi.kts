fun towerofHanoi(n: Int, start: String, aux: String, end: String){

    if(n == 1){
        println("$start -> $end")
    } else {
        towerofHanoi(n - 1, start, end, aux)
        println("$start -> $end")
        towerofHanoi(n - 1, aux, start, end)
    }
}

print("Number of discs?: ")
val num_disc = readLine()?.toInt()

if(num_disc != null){
    towerofHanoi(num_disc, "A", "B", "C")
}

/*
Output:

    Number of discs?: 3
    A -> C
    A -> B
    C -> B
    A -> C
    B -> A
    B -> C
    A -> C

 */