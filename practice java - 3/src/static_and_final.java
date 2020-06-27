class Student {

    static final int MY_CONSTANT = 8;

    String name;
    static String studentClass;
    static int count = 0;

    Student() {
        count++;
    }

    void studentName() {
        System.out.println(name + " is enrolled in: " + studentClass);
    }

    static void classInfo() {
        System.out.println(studentClass);
    }
}

public class static_and_final {
    
    public static void main(String[] args) {
        
        Student.studentClass = "Web Development Fundamentals";
        System.out.println(Student.studentClass);

        Student.classInfo();

        System.out.println("Before creating objects: " + Student.count);

        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println("After creating objects: " + Student.count);

        student1.name = "Steven";
        student2.name = "Daniel";

        student1.studentName();
        student2.studentName();

        System.out.println(Student.MY_CONSTANT);
    }
}
