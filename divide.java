import java.util.*;
public class divide {
    public static int divi(int a,int b){
        int quotient=a/b;
        return quotient;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int quotient=divi(a,b);
        System.out.println(quotient);

    }

}
