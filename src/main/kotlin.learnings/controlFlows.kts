package docs.concepts.controlFlow.labels

fun functionReturn() {
    listOf("Car", "Motor", "Wheels", "Engine", "Speed").forEach {
        if (it == "Wheels") return@forEach
        println(it)
    }

    println("Object Found!")
}

functionReturn()

/*
Output:
Car
Motor
Engine
Speed
Object Found!
 */