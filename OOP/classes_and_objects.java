public class classes_and_objects {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.change_colour("blue");
        System.out.println(p1.colour);
        p1.colour = "Green";
        System.out.println(p1.colour);
    }
}
class Pen{
    int tip;
    String colour;
    
    void change_colour(String newColour){
        colour = newColour;
    }

    void change_tip(int newTip){
        tip = newTip;
    }
}
