import java.util.Scanner;
public class WhileLoopofNumber{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int any_number = number.nextInt();
        int counter = 1;
        while(counter<=10){
            int mul = any_number * counter;
            System.out.println(mul);
            counter++;
        }
        
    }
}