interface Greeter {
    fun greet(name: String)
}

val EN_Greeter = object: Greeter {
    override fun greet(name: String) {
        println("Hello $name !!")
    }
}

EN_Greeter.greet("Carlos Souza")
// Output: Hello Carlos Souza !!