package docs.basics.idioms

/*****
We'll exploring a little about Sigleton (object keyword)
 *****/

object Calculator{
    const val single = "Calculator Singleton"

    fun average(x: Double, y: Double) = (x*y)/2
}

// No need to instant an object
// Não precisamos de um objeto agora!
// -- Acho que o pacote deu certo! AEEEHHH

println(Calculator.single)
//Output: Calculator Singleton

println(Calculator.average(4.0, 8.0))
//Ouyput: 16