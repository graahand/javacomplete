/*
 * This program is written to check whether the number is positive,negative or zero.
 * if_else if_else concept is used.
 */




class Positive_Negative
{
    public static void main(String args[])
    {
        int any_number = -9;
        if(any_number < 0){
            System.out.println("The number is negative.");
        
        }else if(any_number==0){
            System.out.println("The number is zero.");
        }else{
            System.out.println("The number is positive.");
        }
    }
}