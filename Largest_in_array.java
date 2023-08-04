import java.util.*;
public class Largest_in_array {
        public static int largest_number(int marks[]){
            int largest=Integer.MIN_VALUE;
            //int largest;
            for(int i=0;i<marks.length;i++){
                if(marks[i]>largest){
                    largest=marks[i];
                }else{
                    continue;
                }
            }
            return largest;
        }
    public static void main(String args[]){
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values of your array");
               for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();

        }
        int show=largest_number(marks);
        System.out.print("the largest number in your given array is: " + show);
        
    }
    
}
