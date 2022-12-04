/*
 * Printing the sum of first n natural numbers where n = 4.
 * Using loop 
 */
import java.util.Scanner;
public class SumofNaturalNumbers{
    public static void main(String[] args){
        Scanner Number = new Scanner(System.in);
        int any_number = Number.nextInt();
        int sum =0;
        for(int counter=1; counter<=any_number; counter++){ 
            sum = sum + counter;
            
            
        }
        System.out.println(sum);
    }
}