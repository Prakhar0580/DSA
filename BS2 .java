import java.util.*;
public class BS2 {
    
    public static int BS1(int num[], int key){
        int start=0;
        int end=num.length-1;

        while(start <= end){
            int mid= (start + end)/2;

            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]<key){//right
               start=mid+1;
            }
            else{//left
                end=mid-1;
            }
        }
        
    return -1;
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,22,44,66,77,88};
        int key=88;
        System.out.println("key at index"+ BS1(num,key));
    };
    
}