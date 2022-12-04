import java.util.Scanner;
public class SwitchButtonAlt{
    public static void main(String[] args){
        Scanner alternative = new Scanner(System.in);
        String hello = alternative.nextLine();
        switch (hello){
            case "a": System.out.println("Namaster");
            break;
            case "b":System.out.println("Bonjour");
            break;
            case "c": System.out.println("Sewaro");
            break;
            default: System.out.println("Invalid Key");
            
        }
    }
        
        
    }
