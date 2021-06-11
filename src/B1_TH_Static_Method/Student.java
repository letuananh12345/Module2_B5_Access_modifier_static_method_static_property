package B1_TH_Static_Method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void chance(){
        college="codegym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
