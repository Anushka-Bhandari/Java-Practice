public class method_overriding {
    public static void main(String args[]){
        Animal a = new Animal();
        a.eat();

        Animal d = new Deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}