public class inheritance {
    public static void main(String args[]){
        Daughter anushka = new Daughter();
        anushka.cook();
        System.out.println();

        Father jayant = new Father();
        jayant.work();
        Son ram = new Son();
        ram.sleep();
        ram.work();
        System.out.println();

        Child1 sita = new Child1();
        sita.blood_group = "o-";
        System.out.println(sita.blood_group);
        Child2 geeta = new Child2();
        geeta.blood_group = "ab-";
        System.out.println(geeta.blood_group);
        System.out.println();

        Bird b1 = new Bird();
        b1.eat();
        b1.fly();
        Parrot p1 = new Parrot();
        p1.eat();
        p1.fly();
        Crow c1 = new Crow();
        c1.eat();
        c1.fly();
        c1.caw();
    }
}

// single level inheritance
class Mother{
    void cook(){
        System.out.println("cooks");
    }
}
class Daughter extends Mother{
    void dance(){
        System.out.println("dances");
    }
}

// multi level inheritance
class Grandfather{
    void work(){
        System.out.println("works");
    }
}
class Father extends Grandfather{
    void sleep(){
        System.out.println("sleeps");
    }
}
class Son extends Father{
    void study(){
        System.out.println("studies");
    }
}

// hierarchical inheritance
class Parent{
    String blood_group = "o+";
}
class Child1 extends Parent{
    String gender = "girl";
}
class Child2 extends Parent{
    int age = 19;
}

//hybrid inheritance
class Animal{
    void eat(){
        System.out.println("eats");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}
class Parrot extends Bird{
    String colour = "green";
}
class Crow extends Bird{
    void caw(){
        System.out.println("caws");
    }
}