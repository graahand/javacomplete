/*
 * Conditional statements can be written inside the java if we got more than one
 * condition for a problem.
 * But finding the best way is always recommended in programming.
 */




import java.util.Scanner;
public class GreaterLesser{
    public static void main(String[] args){
        Scanner TwoNumbers = new Scanner(System.in);
        int first_number = TwoNumbers.nextInt();   // Two inputs are taken using Scanner obj.
        int second_number = TwoNumbers.nextInt();
        
        if (first_number == second_number){
            System.out.println("Two numbers are equal.");
        } else{    // we can use condtional statement inside a conditional statement.
            if (first_number>second_number){
                System.out.println("first_number is greater than second_number.");
                            } else{
                System.out.println("first_number is smaller than second_number.");
            }
        }
    }
}