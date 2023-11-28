package basicExamples;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        int math, physics, turkish, history, music, chemistry;
        float average;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your math score : ");
        math = input.nextInt();

        System.out.print("\nEnter your physics score : ");
        physics = input.nextInt();

        System.out.print("\nEnter your turkish score : ");
        turkish = input.nextInt();

        System.out.print("\nEnter your history score : ");
        history = input.nextInt();

        System.out.print("\nEnter your music score : ");
        music = input.nextInt();

        System.out.print("\nEnter your chemistry score : ");
        chemistry = input.nextInt();

        average = (math + physics + turkish + history + music + chemistry) / 6 ;

        System.out.println("\nAvarega is : "+ average);
    }
}
