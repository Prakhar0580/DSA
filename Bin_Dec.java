import java.util.*;
public class Bin_Dec {

    public static int bin_dec(int n){
        int x=n;    
        int a;//just for storing last digit of a binary numbers
            int power=0;
            int dec=0;
            while(n>0){
                a=n%10;
               dec= dec + a*(int)(Math.pow(2, power)); //int is used just for typecasting
                power++;
                n=n/10;
                
            }
            System.out.print("Decimal of your number  " + x+"is " + dec);
                   return 1;
    }
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        bin_dec(num);

        
    }
}   
