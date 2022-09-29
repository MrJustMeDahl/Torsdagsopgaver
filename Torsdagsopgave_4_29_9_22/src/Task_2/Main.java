package Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type your name :");
        String name = userInput.nextLine();
        System.out.println("Your name is : " + name + "\nPlease type your age");
        int age = userInput.nextInt();
        System.out.println("Your age is : " + age);
        int timeToRetirement = 67 - age;
        System.out.println("You can retire in " + timeToRetirement + " years.");
    }
}
