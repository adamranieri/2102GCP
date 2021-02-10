// Groovy is a JVM targeted language
// Groovy code can be compiled into Java Byte code and run on a JVM
// The syntax of Groovy is like a Python - Java blend

// Typing is OPTIONAL in groovy
def greet(String name){
    println("Hello " + name)
}

def hola(String nombre){
    println "Hola " + nombre
}

greet("Adam")
hola("Tim")

// In groovy if a method has only one parameter you can omit parentheses
// identical to the previous greet method
greet "Steven"

// DSL Domain Specific Language
// A highly specialzed programming language 
// Gradle is a groovy DSL
// Highly specialized functions like depencies and compile
// DSL very easy to read and write
// Not general purpose
