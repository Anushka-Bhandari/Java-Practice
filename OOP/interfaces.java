public class interfaces{
    public static void main(String args[]){
        Chess q1 = new Queen();
        q1.moves();

        // q1.sepciality(); cannot be implemented because q1 is queen object but reference type is Chess and chess doesn't contain speciality function
        System.out.println(q1.color);
        System.out.println(Chess.color); // bcz color is static it doesn't belong to an object , it belongs to interface
        System.out.println();

        King k1 = new King();
        k1.moves();
        k1.speciality();
        System.out.println(k1.color);
    }
}

interface Chess{
    String color = "white and black";
    void moves();
}

class Queen implements Chess{
    public void moves(){
        System.out.println("can move left, right, up, down and diagonally");
    }
    void speciality(){
        System.out.println("strongest piece");
    }
}

class King implements Chess{
    public void moves(){
        System.out.println("can move left, right, up, down, diagonally but only 1 step");
    }
    void speciality(){
        System.out.println("can't kill king only checkmate possible");
    }
}
