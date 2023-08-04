import java.util.*;
public class Darr_input {
    public static void print_arr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value inside the array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.print("Your printed array is: ");
        print_arr(arr);
        
    }
}
