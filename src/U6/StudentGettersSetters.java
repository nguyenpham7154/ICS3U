import java.util.*;

class Student {
    String name, address, phone, email, password;
    int age;

    public void setStudentPassword() {
        this.password = name.charAt(1) + Integer.toString(this.age%10) + this.address.charAt(0) + phone.substring(3, 6);
    }

    public String getStudentPassword(String adminPass) {
        if (adminPass.equals("admin")) return this.password;
        return "invalid";
    }
}

public class StudentGettersSetters {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String adminPass;
        String [] names = {"Adam", "Bert", "Cansu", "David", "Ernie"};
        int [] ages = {12, 13, 14, 15, 16};
        String [] addresses = {"123 Happy Lane, Ottawa, ON", "45 Colonel By Dr, Ottawa, ON", "32 Abc Dr, Ottawa, ON"};
        String [] phones = {"613-555-3333", "613-555-3333", "613-555-2312"};


        Student [] students = new Student[3];

        for(int i = 0; i < 3; i++){
            students[i] = new Student();
            students[i].name = names[i];
            students[i].age = ages[i];
            students[i].address = addresses[i];
            students[i].phone = phones[i];
            students[i].email = names[i]+"mom@gmail.com";
            students[i].setStudentPassword();
        }

        for (int x = 0; x < 3; x++) {
            adminPass = s.nextLine();
            System.out.println("Password check - student " +(x+1) +" : " + students[x].getStudentPassword(adminPass));   
        }
    }
}