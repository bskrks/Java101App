package basicExamples;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age, salary;

        System.out.print("Enter your name : ");
        name = input.nextLine();

        System.out.print("Enter your age : ");
        age = input.nextInt();

        System.out.print("Enter your salary : ");
        salary = input.nextInt();

        System.out.print("Name : "+ name + "\nAge : "+ age +"\nSalary : "+ salary);
    }
}
