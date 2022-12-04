import java.util.Scanner;
public class ElseIfGreaterLesser{
    public static void main(String[] args){
        Scanner any_number = new Scanner(System.in);
        int first_number = any_number.nextInt();
        int second_number = any_number.nextInt();
        if (first_number == second_number){
            System.out.println("Both the numbers are equal.");
            
            //There is no limit for the number of else if we can use inside the java program.
            // else if is only checked if if statement is false
            // That's why instead of using if statements multiple time else if is used.
            // When we have only one statement to print curly braces is not compulsory
            // after if statement.
        
        }else if (first_number<second_number) {   //instead of using if inside else,we can
                                                  // use else if and give another condition.
            System.out.println("Second number is greater than second number.");
            
        }else{
            System.out.println("First number is greater than second number.");
        }
    }
}