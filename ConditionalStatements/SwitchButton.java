import java.util.Scanner;
public class SwitchButton{
    public static void main(String[] args){
        Scanner Switch = new Scanner(System.in);
        int button = Switch.nextInt();
        switch(button){    // syntax for switch is switch(variable){ cases}
            case 1: System.out.println("Namaste");  //  Naming of cases is done
            break; // according to input values.
            case 2: System.out.println("Bonjour");
            break;
            case 3: System.out.println("Hello");
            break;
            default: System.out.println("Invalid Button");
            
        }
       
    }
}