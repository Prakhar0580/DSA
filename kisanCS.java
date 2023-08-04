public class kishanCS{
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        //for finding largest element in our array.
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //for creating count array or to store frequency of our elements in our array.
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //soring of our array.
        int j=0;
        for(int i=0;i<arr.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        countingsort(arr);
        System.out.print(printarr(arr));
    }
}