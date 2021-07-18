fun functionReturn() {
    listOf("Car", "Ball", "Dog", "Futebol").forEach {
        if (it == "Dog") return@forEach
        println(it)
    }
    println("Terminated")
}

fun main() {
    functionReturn()
}