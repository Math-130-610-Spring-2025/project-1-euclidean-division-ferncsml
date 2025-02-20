/**
 * EuclideanDivision performs Euclidean division on two integers.
 * <p>
 * This program demonstrates:
 * <ul>
 *   <li>Initializing a Scanner object (scnr) to read from System.in</li>
 *   <li>Prompting the user for a dividend and a divisor</li>
 *   <li>Computing the quotient and remainder using Euclidean division</li>
 *   <li>Formatting the output for readability (including line skips)</li>
 *   <li>Properly closing the Scanner resource</li>
 * </ul>
 * </p>
 *
 * @author Fernando Camarena
 */
import java.util.Scanner;

public class EuclideanDivision {
    public static void main(String[] args) {

        // instantiate "Scanner(System.in)" as scnr 
        Scanner scnr = new Scanner(System.in);

        // declare all of our var 
        int dividend, divisor, quotient, remainder;

        // println statement for ui purposes
        System.out.println("Euclidean Division");
        
        // print statement to prompt user for input "dividend"
        System.out.print("Enter the dividend: ");

        // initializing dividend var
        dividend = scnr.nextInt();

        // print statement to prompt user for input "divisor" 
        System.out.print("Enter the divisor: ");

        // initializing divisor var
        divisor = scnr.nextInt();

        // computing and initializing "quotient" with our two inputs
        quotient = dividend / divisor;
        // computing and initializing "remainder" with our two inputs utilizing modulo op.
        remainder = dividend % divisor;

        // formatting output for easier readability and maintainability 
        // ensuring line skip and proper output
        System.out.printf("%d = %d * %d + %d%n", dividend, divisor, quotient, remainder);

        scnr.close();
    }
}
