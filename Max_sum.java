public class Max_sum {
    //by brute force method 
    public static int print_subarr(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i;j<=arr.length-1;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
               if(sum>max_sum){
                max_sum=sum;
               }
            }
        }
        return max_sum;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        System.out.println(print_subarr(arr)); 
}
}
