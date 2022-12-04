/* 
 * In this program we have used ternary operator for
 * checking the largest and smallest number between two numbers given.
 */


class Smallest_Largest{
    public static void main(String args[]){
        int first_number =90;
        int second_number = 89;
        int smallest_number=(first_number<second_number)? first_number:second_number;
        int largest_number = (first_number>second_number)?first_number:second_number;
        System.out.println("The smallest number is" + smallest_number);
        System.out.println("The largest number is" + largest_number);
    }
}







