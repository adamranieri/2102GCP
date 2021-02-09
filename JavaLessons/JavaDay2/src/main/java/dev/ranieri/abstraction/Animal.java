package dev.ranieri.abstraction;

// The only thing making a class abstract does is make it impossible to directly build an instance of this class
public abstract class Animal {

    String species;
    int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }
    public Animal(int age) {
        this.species = "Proto-Animal";
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    // IF you have abstract class you can create abstract methods
    /// an abstract method is a method with no implementation
    abstract void eat();
}
