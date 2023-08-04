import java.util.*;
public class SumofIntegersofnumber {
    public static void Sum_of_integer(int num){
       int a=num;
        int sum=0;
        int var;
        if(num==0){
            System.out.print("Sum is 0");
        }else{
        while(num>0){
            var=num%10;
            sum=sum+var;
            num=num/10;
        

        }
        System.out.print("Sum of you number "+a+" is"+sum);
    }
    }        
    
    public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                Sum_of_integer(num);
            }
}
