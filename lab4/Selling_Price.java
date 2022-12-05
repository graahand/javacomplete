/*
 * In this program I have used Input concept in java along with switch case to find the 
 * selling price of the product when discount and marked price is given.
 */



import java.util.Scanner;
public class Selling_Price
{
    public static void main(String args[])
    {
        Scanner category = new Scanner(System.in);
        char which_category = category.next().charAt(0);
        int discount = 60;
        int marked_price = 50000;
        float sellingprice= marked_price-(marked_price*discount/100);
        switch(which_category){
            case 'A':System.out.println(sellingprice);
            break;
            default:System.out.println("Invalid Button");
            
        
        
        
        
        }
    }
}