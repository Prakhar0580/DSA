public class Counting_Sort {
    //to find the larger number in the given array
     public static int larger(int arr[]){
             int largest=Integer.MIN_VALUE;
             for(int i=0;i<arr.length;i++){
             
                 if(arr[i]>largest){
                     largest=arr[i];
                 }
             }
             
             return largest;
     }
             //making a counting array
             public static void counting(int arr[], int largest){
                 int count[]=new int[largest+1];
                 for(int j=0;j<=largest;j++){
                     
                         count[arr[j]]++;
 
 
                     }
                 
                 
                 int j=0;
                 for(int i=0;i<count.length;i++){ //i made my mistake here i wrote arr.length.
                     while(count[i]>0){
                         arr[j]=i;
                         j++;
                         count[i]--;
                     }
                 }
             }
             public static void print_arr(int arr[]){
                 for(int i=0;i<arr.length;i++){
                     System.out.print(arr[i]+" ");
                 }
             }
     public static void main(String args[]){
         int arr[]={3,6,2,1,8,7,4,5,3,1};
         int largest=larger(arr);
         counting(arr,largest);
         print_arr(arr);
 
     }
 }
 