// A base package of the project used to store related classes in the project
package programmingII;

// Importing java.util.Scanner to help in asking for user inputs
import java.util.Scanner;

// Initialising a public class called Main to store main function
public class Main {
    // Defining a main function of the program, it's a method of class Main which is public or accessible by other classes   
    public static void main (String[] args){
        // Defining a Scanner object for asking user inputs
        Scanner scanner = new Scanner(System.in);

        // Asking height and weight and read the answers as float
        System.out.print("\nEnter your height(m): ");
        float height = scanner.nextFloat();
        System.out.print("Enter you weight(kg): ");
        float weight = scanner.nextFloat();

        // Calculating BMI of the user using the formula, and store in result as double and printing it out with 2 decimal points
        double result = (weight / Math.pow(height, 2));
        System.out.format("\nYou BMI is %.2f\n", result);

    }
}
