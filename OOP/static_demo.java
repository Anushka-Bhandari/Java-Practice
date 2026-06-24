public class static_demo {
    public static void main(String args[]){
        System.out.println(Student.university);
        Student.uni_description();
        Student.Total_Marks t = new Student.Total_Marks();
        System.out.println(t.total_marks);
        
        Student s1 = new Student();
        s1.roll_no = 11;
        System.out.println(s1.roll_no);
        s1.setAge(19);
        Student.Student_details sd = s1.new Student_details();
        sd.show_age();
    }
}

class Student{
    static String university = "stanford";
    int roll_no;
    int age;

    void setAge(int age){
        this.age = age;
    }

    static void uni_description(){
        System.out.println("Stanford University is a prestigious,\n" + 
        "world-renowned private research university located in Stanford,\n" +
        "California. Founded in 1885 by Leland and Jane Stanford in memory of their only child,\n" + 
        "the university spans a massive 8,180-acre suburban campus in the San Francisco Bay Area.\n" +
        "It consistently ranks among the top universities globally,\n" +
        "famous for its highly selective admissions, cutting-edge research, and critical role in the rise of Silicon Valley.");
    }

    class Student_details{
        void show_age(){
            System.out.println(age);
        }
    }

    static class Total_Marks{
        int total_marks = 100;
    }

    {
        System.out.println("Non-static block executed");
    }

    static{
        System.out.println("Static block executed");
    }
}
