// A base package of the project used to store related classes in the project
package programmingII;

// Importing java.util.Scanner to help in asking for user inputs
import java.util.Scanner;

// Initialising a class called Question2 for answering sub-question 2
public class Question2 {
     // Defining a main function of the program, it's a method of class Main which is public or accessible by other classes   
    public static void main (String[] args){
        // Defining a Scanner object for asking user inputs
        Scanner scanner = new Scanner(System.in);

        // Asking the length and width of the rectangle and read the answers as integers(as illustrated in prompt).
        System.out.print("\nEnter length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int width = scanner.nextInt();

        // Calculate the perimeter and the surface area using the formula and read them as integers
        int perimeter = 2*(length + width);
        int surfaceArea = length * width;

        // Printing out the results of perimeter and surface area of the rectangle using different data types
        System.out.println("\nThe perimeter of the rectangle using short data type is : "+ (short) perimeter);
        System.out.println("The perimeter of the rectangle using integer data type is : "+ perimeter);
        System.out.println("The perimeter of the rectangle using long data type is : "+ (long) perimeter);
        System.out.format("The perimeter of the rectangle using float data type is : %.4f\n", (float) perimeter);

        System.out.println("\nThe surface area of the rectangle using short data type is : "+ (short) surfaceArea);
        System.out.println("The surface area of the rectangle using integer data type is : "+ surfaceArea);
        System.out.println("The surface area of the rectangle using long data type is : "+ (long) surfaceArea);
        System.out.format("The surface area of the rectangle using float data type is : %.4f\n", (float) surfaceArea);
    }
}
