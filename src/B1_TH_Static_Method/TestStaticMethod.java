package B1_TH_Static_Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.chance();
        Student student = new Student(111, "Hoang");
        Student student2 = new Student(211, "Quan");
        Student student3 = new Student(311, "Quang");
        student.display();
        student2.display();
        student3.display();
    }
}
