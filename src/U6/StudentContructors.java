class Student {
    String name, password;
    int age, grade;
    
    public Student() {
        this.name = "student";
        this.grade = 9;
        this.age = 14;
        this.password = "cb";
    }

    public Student(String n, int g, int a) {
        this.name = n;
        this.grade = g;
        this.age = a;
        this.password = "cb";
    }

    public Student(String n) {
        this.name = n;
        this.grade = 9;
        this.age = 14;
        this.password = "cb";
    }

	public void print() {
        System.out.println("-------------------------------------------------");
        System.out.println("STUDENT INFO |             ");
        System.out.println("Name         | " + this.name);
        System.out.println("Age          | " + this.age);
        System.out.println("Grade        | " + this.grade);
        System.out.println("Password     | " + this.password);

    }
}

public class StudentContructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("William Gates", 11, 16);
        Student s3 = new Student("Steven Jobs");

        s1.print();
        s2.print();
        s3.print();
    }
}
