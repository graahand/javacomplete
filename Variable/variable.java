public class Variable{
    public static void main(String[] args){
        int m = 39;
        m++;
        --m;
        int x = m++;
        int y = --m;
        System.out.println(m++);
        System.out.println(m);
        System.out.println(x);
        System.out.println(y);
    }
}
