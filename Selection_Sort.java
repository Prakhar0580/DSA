import java.util.*;
public class Selection_Sort {
    public static void Selection(int arr[]){
        int n;
        int temp;
        n=arr.length;
        for(int i=0;i<=n-1;i++){
            int minpos=i;
            for(int j=i;j<n-1;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
        public static void main(String args[]){
            int arr[]={3,4,1,0,5};
            Selection(arr);
            printarr(arr);

        }
}
