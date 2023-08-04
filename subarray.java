public class subarray {
    public static void print_subarr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        print_subarr(arr);
    }
}
