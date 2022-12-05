/*
 * In this program i have used conditional statements in java along with input method.
 */


import java.util.Scanner;
public class switch_sellingprice
{
    public static void main(String args[])
    {
        Scanner category = new Scanner(System.in);
        char which_category = category.next().charAt(0);
        int discount = 60;
        int marked_price = 50000;
        float sellingprice= marked_price-(marked_price*discount/100);
        if(which_category=='A'){
            System.out.println(sellingprice);
        
            
        }
        }
        
        
        
    }
