public class abstract_class {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println();
        Mustang m = new Mustang();
        m.eat();
        m.walk();
        System.out.println();
        Animal a = new Horse();
        a.eat();
        a.walk();
    }
}
abstract class Animal{
    //abstract class can have constructors
    Animal(){
        System.out.println("animal constructor called");
    }

    // abstract class can have abstract methods
    abstract void walk();
    
    // abstract class can also have non-abstract methods
    void eat(){
        System.out.println("animal eats");
    }
}

//abstract class(Animal) can be extended by another abstract class
abstract class Chicken extends Animal{
    Chicken(){
        System.out.println("chicken constructor called");
    }
}

//abstract class(Animal) can be extended by another non-abstract class
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }

    //it is necessary for non-abstract child class to implement the abstract methods present in parent abstract class
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}
abstract class Student{
    //if a class have abstract method it must be an abstract class
    abstract void study();
}
