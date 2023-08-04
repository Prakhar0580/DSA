import java.util.*;
public class HalfPyramidPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        for(int i=1;i<=n;i++){
            for(number=1;number<=i;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
