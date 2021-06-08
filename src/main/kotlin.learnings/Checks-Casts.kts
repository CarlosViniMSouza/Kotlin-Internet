/***************************
Type Checks and Smart Casts
 *************************/

open class Animal

class Felines : Animal() {
    fun meow() = println("Meow!")
    fun roar() = println("Roar!")
}

class Dogs : Animal() {
    fun bark() = println("Woof")
    fun howl() = println("Auuu!")
    fun scream() = println("Ruur!")
}

fun howDoesAnimals(Animal: Animal) {

    when (Animal) {
        //Felines:
        is Cat -> Animal.meow()
        is Tiger -> Animal.roar()
        is Lion -> Animal.roar()
        is Jagar -> Animal.roar()

        //Dogs:
        is Dog -> Animal.bark()
        is Wolf -> Animal.howl()
        is Bear -> Animal.scream()
    }
}

howDoesAnimals(Tiger())
howDoesAnimals(Wolf())
/*Output:
Roar!
Auuu!
 */
