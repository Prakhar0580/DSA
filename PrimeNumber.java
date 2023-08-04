import java.util.*;
public class PrimeNumber {
    public static boolean Prime(int a){
        if(a==2){
            return true;
        }
        boolean Isprime=true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return Isprime;
                
            }


        
    
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(Prime(i)==true){
                System.out.print(i+ " ");
            }
        }
    }
}

