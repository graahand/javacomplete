import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner Integer = new Scanner(System.in);
        int any_number = Integer.nextInt();
        if (any_number%2==0){
            System.out.println("This is even number.");
        
        } else{
            System.out.println("This is odd number.");
        }
    }
}