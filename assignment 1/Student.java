

import java.util.Scanner;

public class Student {
    int rollmunber;
    String studname;
    float percentage;
    
    void acceptDetails(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enetr Roll Number");
            rollmunber = sc.nextInt();
            sc.nextLine();
            System.out.print("Enetr Name");
            studname = sc.nextLine();
            System.out.print("Enetr percentage");
            percentage = sc.nextFloat();
        }

    }

    void displayDetails(){
        System.out.println(rollmunber);
        System.out.println(studname);
        System.out.println(percentage);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details for student 1");
        s1.acceptDetails();
        System.out.println("Enter details for student 2");
        s2.acceptDetails();

        s1.displayDetails();
        s2.displayDetails();
    }
}
