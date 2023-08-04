
import java.util.*;
public class two {
    public static void hollow_square(int row , int col){
        row=1;
        col=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(j==1||i==1||i==row||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(){
       /*  Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns:");
        int col=sc.nextInt();*/
        hollow_square(4,5);


    }
}


