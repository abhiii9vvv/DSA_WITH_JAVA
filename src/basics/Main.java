package First.src.basics;

import java.util.Scanner; // Imports the Scanner class for user input.

// Defines the Student class to hold student data.
class Student {
    int roll;          // Student's roll number.
    String studentName; // Student's name.
}

// Defines the Alegbra class for arithmetic operations.
class Alegbra{
    // Method to add two integers.
    int add( int a ,int b){
        return a+b;
    }
}

// Main class where the program execution starts.
public class Main{
    public static void main(String[] args){
        // Create a Scanner object to read input.
        Scanner sc =new Scanner(System.in);

        // --- First.src.math.Algebra Calculation Section ---
        // Create an Alegbra object.
        Alegbra obj11= new Alegbra();
        System.out.println("Enter the num1:");
        int x=sc.nextInt();
        System.out.println("Enter the num2");
        int y=sc.nextInt();
        System.out.println();
        // Calculate and print the sum.
        System.out.println("TOTAL SUM-->>"+obj11.add(x,y));

        System.out.println();

        // --- Student Object 1 Section ---
        // Create the first Student object and assign values.
        Student obj1=new Student();
        obj1.roll=2023281975;
        obj1.studentName="Abhinav";
        // Print student 1's details.
        System.out.println(obj1.roll);
        System.out.println(obj1.studentName);

        System.out.println();

        // --- Student Object 2 Section ---
        // Create the second Student object and assign values.
        Student obj2=new Student();
        obj2.roll=2023286582;
        obj2.studentName="Abhiii9vvv";
        // Print student 2's details.
        System.out.println(obj2.roll);
        System.out.println(obj2.studentName);

    }
}