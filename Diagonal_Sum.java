//By brute force method
import java.util.*;
public class Diagonal_Sum {
    public static void Diagonal(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
                else if(i+j==2){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.print("The value of your diagonal sum is: "+sum);
    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        System.out.print("Enter the values inside the 2D array: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        print(matrix);
        Diagonal(matrix);

    }
}
