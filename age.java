import java.util.*;
public class age {
    public static void eligible(int n){
        if(n<=18){
            System.out.println("you are not eligible to vote");
        }
        else{
            System.out.println("you are eligible to vote");
        }
}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        eligible(n);
    }
}