public class multiple_inheritance_byInterfaces {
    public static void main(String args[]){
        Child c1 = new Child();
        c1.height();
        c1.skin_color();
        /*System.out.println(c1.eye_color); gives error bcz mother and father both have a final,
         static variable eye_color and java can't decide which one you are referring to */ 
        System.out.println(Mother.eye_color);
        c1.nature(); // works bcz one implementation of nature() satisfies both interfaces
    }
}

interface Mother{
    String eye_color = "black";
    void height();
    void nature();
}

interface Father{
    String eye_color = "brown";
    void skin_color();
    void nature();
}

class Child implements Mother, Father{
    public void height(){
        System.out.println("height : 5 feet");
    }
    public void skin_color(){
        System.out.println("fair");
    }
    public void nature(){
        System.out.println("is very bubbly and talkative");
    }
}