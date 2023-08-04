import java.util.*;
public class Switch1 {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         switch(num){
            case 1 : System.out.println("Hello Monday :)");
            break;
            case 2 :  System.out.println("Hello Tuesday :)");
            break;
            case 3 :  System.out.println("Hello Wednesday :)");
            break;
            case 4 :  System.out.println("Hello Thursday :)");
            break;
            case 5 : System.out.println("Hello Friday :) ");
            break;
            case 6 : System.out.println("Hello Saturday :) ");
            break;
            case 7 : System.out.println("Hello Sunday :)");
            break;
            default :System.out.println("Go and Learn weeks and numbers XD");
         }
    }
}
