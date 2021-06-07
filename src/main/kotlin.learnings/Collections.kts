/************
Collections*
***********/

val numbers = listOf(1, 3, 9, 27, 81, 243)

// Iterating ever a collection
for(number in numbers) {
    print(number)
}
println()
//Output: 1392781243

//Check  if a collection contains something
when{
    10 in numbers -> println("Six is contain List")
    10 !in numbers -> println("Six isn't contain List")
}
//Output: Six isn't contain List

// Lambdas x Collections
var animals = listOf("Dog", "Cat", "Duck", "Pig", "Shark", "Hedgehog")
animals
    .filter {it.startsWith("D")}
    .sortedBy {it}
    .map {it.lowercase()}
    .forEach {print("$it")}
//Output: dogduck