public class constructors {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.roll_no = 101;
        s1.name = "Anushka";
        s1.marks[0] = 84;
        s1.marks[1] = 75;
        s1.marks[2] = 73;
        s1.getValues();
        Student s2 = new Student(102);
        s2.name = "Aastha";
        s2.marks[0] = 54;
        s2.marks[1] = 45;
        s2.marks[2] = 43;
        s2.getValues();
        Student s3 = new Student(s1);
        s3.getValues();
        s1.marks[2] = 93;
        System.out.println("after changing s1: ");
        s1.getValues();
        s3.getValues();
    }
}
class Student{
    int roll_no;
    String name;
    int marks[] = new int[3];
    // non-parameterized constructor
    Student(){
        System.out.println("object is created!");
    }

    //parameterized constructor
    Student(int roll_no){
        this.roll_no = roll_no;
    }

    //shallow copy constructor
    // Student(Student s){
    //     this.roll_no = s.roll_no;
    //     this.name = s.name;
    //     this.marks = s.marks;
    // }

    //deep copy constructor
    Student(Student s){
        this.roll_no = s.roll_no;
        this.name = s.name;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s.marks[i];
        }
    }

    void getValues(){
        System.out.println("roll_no: " + this.roll_no);
        System.out.println("name: " + this.name);
        System.out.print("marks: ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
