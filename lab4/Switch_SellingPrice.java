
public class Switch_SellingPrice
{
    public static void main(String args[])
    {
        int marked_price = 5000;
        int discount = 40;
        String category="A";
        float selling_price = marked_price - (marked_price * discount/100);
        if(category=="A" & discount==40 ){
            if( marked_price == 5000){
                System.out.println(selling_price);
            }

        }
        
        
        
    }
}