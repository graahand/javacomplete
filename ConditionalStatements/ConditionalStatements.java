import java.util.Scanner;
public class ConditionalStatements{
    public static void main(String[] args){
        Scanner Condition = new Scanner(System.in);  // object is created using scanner class
        int input_age = Condition.nextInt();     // input is taken.
        
        if (input_age>18){   // if (condition){} else {}.
            System.out.println("You can vote.");
            
            } else{
                System.out.println("You cannot vote.");
        }
         
                   
        }
    }
