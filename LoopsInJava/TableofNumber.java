import java.util.Scanner;
public class TableofNumber{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int any_number = number.nextInt();
               for (int  counter = 1; counter<=10; counter++){
              int mul = counter * any_number;
              System.out.println(mul);
        }
    }
}