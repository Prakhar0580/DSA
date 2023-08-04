import java.util.*;
public class TrappingRainWater {
    public static int trapping(int arr[]){
        int watertrapping=0;
        int sum=0;
        int trappedwater=0;
        int n=arr.length;
        int largest_left[]=new int[n];  
        int largest_right[]=new int[n];
        largest_left[0]=arr[0];
        largest_right[n-1]=arr[n-1];
        //for calculating left auxillary array
        for(int i=1;i<n;i++){
            largest_left[i]=Math.max(arr[i], largest_left[i-1]);
        }
        //for calculating right auxillary array
        for(int j=n-2;j>=0;j--){
            largest_right[j]=Math.max(arr[j], largest_right[j+1]);
        }
        //for calculating amount of water trapping
        for(int i=0;i<=n-1;i++){
            sum=sum+trappedwater;
         watertrapping=Math.min(largest_left[i], largest_right[i]);
         trappedwater=watertrapping-arr[i];
         
        }
        return sum;

    }
    public static void main(String args[]){
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int watertrapping=trapping(arr);
        System.out.print("the value of water trapping of your water is :"+watertrapping);

    }
}
