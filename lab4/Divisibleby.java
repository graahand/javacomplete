/*
 * This program check whether the number is divisible by both 3 and 5.
 * if_else concept is used.
 */
class Divisibleby
{
    public static void main(String args[])
    {
        int given_number = 15;
        if(given_number%3==0 & given_number%5==0)
        {
            System.out.println("The numbe is divisible by 5 and 3");
        }
        else
{
            System.out.println("The number is not divisible by both numbers");
        }
    }
}
