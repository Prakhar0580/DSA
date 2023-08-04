import java.util.*;
public class BinarySearch {
    public static int Binary(int arr[],int key){
        int l=0;
        int h=arr.length-1;
        int mid;
                while(l<=h){
                    mid=(l+h)/2;
                    if(key==arr[mid]){
                        return arr[mid];
                    }else if(key>arr[mid]){
                        l=mid+1;
                    }else{
                        h=mid-1;
                    }
                }
                return -1;
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        int key;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();    
        }
        System.out.print("Enter the value you wanna search: ");
        key=sc.nextInt();
       int var= Binary(arr,key);
       if(var>0){
       System.out.print("Search element found i.e "+var);
       
       }else{
        System.out.print("your element not found");
       }


    }
}
