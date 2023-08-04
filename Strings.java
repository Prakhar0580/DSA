import java.util.*;
public class Strings {
    public static void main(String args[]){
        String str;
        String str2;
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the String using only sc.next");
        str=sc.next();
        System.out.println(str);
        System.out.println("Length of your name is "+ str.length());
        for(int i=0;i<4;i++){
            System.out.print(str.charAt(i)+"  ");
        }
        System.out.println("Enter the String using sc.nextLine");       
        str2=sc2.nextLine();
        System.out.print(str2);
        System.out.println("Length of your name is: "+ str2.length());
        for(int i=0;i<7;i++){
            System.out.print(str2.charAt(i)+"  ");
        }


    }
}
