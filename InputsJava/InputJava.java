/* 
 * Scanner class is located in the java.util package.
 * We can only import Scanner class in java from java.util.
 */


import java.util.Scanner;
public class InputJava{
    public static void main(String[] args){
        Scanner MyObject = new Scanner(System.in);   // object is created using scanner class
        int a = MyObject.nextInt();  // nextInt takes the interger type input value.
        int b = MyObject.nextInt();  // System.in is used for taking input in java.
        int product = a *b;   // Input is taken in the console for this type of program.
        System.out.println(product);
    }
}
