import java.util.*;

class Student {
	String fname, lname;
    int age, grade;
}

public class StudentClass {
	public static Scanner userInput = new Scanner(System.in);
	public static void main (String args[]) {
		Student[] students = new Student[4];
		for(int i = 0; i < 4; i++){
            students[i] = new Student();
            students[i].fname = userInput.next();
            students[i].lname = userInput.next();
            students[i].age = userInput.nextInt();
            students[i].grade = userInput.nextInt();
        }
		
		System.out.println(students[0].fname);
		System.out.println(students[1].lname);
		System.out.println(students[2].age);
		System.out.println(students[3].grade);
	}
}
