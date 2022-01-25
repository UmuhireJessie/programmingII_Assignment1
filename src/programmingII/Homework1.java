// the base package of the project 
package programmingII;

// Importing java.util.Scanner to help in asking for user inputs
import java.util.Scanner;

// Initialising a class called Homework1 for answering the homework
public class Homework1 {
    // Defining the public main method of the class Main
    public static void main (String[] args){
        // Creating the Scanner function to help us make user unput of the number 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        byte number = scanner.nextByte();       
        // Creting switch cases in case the user enter a number between 1 and 12 and also the default statement if otherwise
        switch (number) {
            case 1 -> System.out.println("It's January");
            case 2 -> System.out.println("It's February");
            case 3 -> System.out.println("It's March");
            case 4 -> System.out.println("It's April");
            case 5 -> System.out.println("It's May");
            case 6 -> System.out.println("It's June");
            case 7 -> System.out.println("It's July");
            case 8 -> System.out.println("It's August");
            case 9 -> System.out.println("It's September");
            case 10 -> System.out.println("It's October");
            case 11 -> System.out.println("It's November");
            case 12 -> System.out.println("It's December");
            default -> System.out.println("There is no such a month");
        }
}
}
