import java.util.*;
public class arrays {
   public static void arr(int marks[]){
            for(int i=0;i<marks.length;i++){
                marks[i]=marks[i]+1;
            }
        }
            public static void arr2(int marks[]){
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<marks.length;i++){
                    marks[i]=sc.nextInt();
                }
            }
   
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        int marks[]=new int[10];
        System.out.print("Enter the values inside the arrays");
        arr2(marks);
       /* marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[4]=sc.nextInt();*/
        System.out.println("Values of arrays after the operation");
        arr(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
      
       
    }
}
