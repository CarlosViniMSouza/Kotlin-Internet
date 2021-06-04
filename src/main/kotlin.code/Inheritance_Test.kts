//base class
open class baseClass{
    val name = "Geeks Inside"
    fun function_A(){
        println("Base Class")
    }
}

//derived class
class derivedClass: baseClass(){
    fun function_B(){
        println("Derived Class")
        println(name)   //inherit name - property
    }
}

//execution
val derived = derivedClass()
derived.function_A()    //inherting the base class function
derived.function_B()    //calling derived class function