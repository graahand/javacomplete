public class switch_sellingprice
{
    public static void main(String args[])
{
    int marked_price1 = 9000;
    int marked_price2 = 3000;
    int marked_price3 = 4000;
    int marked_price_4 = 9900;
    int discount_1 = 60;
    int discount_2 = 40;
    int discount_3 = 20;
    int discount_4 = 10;
    String category = "B";
    float selling_price =  marked_price1- (marked_price1 * discount_1/100);
        if(category=="A" & discount_1==40 ){
    switch(category){
        case "B":System.out.println(selling_price);
        break;
        
    }

}
}
}