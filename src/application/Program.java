package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be included? = ");
        int length = sc.nextInt();
        People[] people = new People[length];

        double totalHeight = 0;
        double sub16 = 0;

        for (int i = 0; i < length; i++) {
            System.out.printf("%dº Person Data:\n", i + 1);
            sc.nextLine();
            System.out.print("Name = ");
            String name = sc.nextLine();
            System.out.print("Age = ");
            int age = sc.nextInt();
            System.out.print("Height = ");
            double height = sc.nextDouble();
            totalHeight += height;
            people[i] = new People(name, age, height);
            if (people[i].age < 16) {
                sub16++;
            }
        }

        System.out.printf("\nAverage height = %.2f\n", totalHeight / length);
        System.out.printf("People under 16 years old = %.2f%%\n", (sub16 / length) * 100);
        for (int i = 0; i < length; i++) {
            if (people[i].age < 16) {
                System.out.println(people[i].name);
            }
        }
    }
}
