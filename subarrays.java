import java.util.*;
public class subarrays {
    public static void Subarray(int arr[]){
        int sum=0;
            for(int i=0;i<arr.length;i++){     //loop for introducing start that is now on zero index of array.
                int start=i;
                if(start==start++){   //for reseting the values of sum 
                    sum=0;
                }else{
                        continue;
                    }
                
                for(int j=i;j<arr.length;j++){  //loop for introducing end that is also on zero index of array but increasing continously.
                    int end=j;
                    sum=sum+arr[j];
                    for(int k=start;k<=end;k++){   
                        System.out.print(arr[k]+" ");
                        if(k==end){
                            System.out.println("Sum is: "+ sum);
                        }
                        else{
                            continue;
                        }
                        }
                       
                    }
                    System.out.println();
                }
                System.out.println();
            }
            
    
    public static void main(String args[]){
            int arr[]=new int[5];
            System.out.print("Enter the values inside the array:");
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            Subarray(arr);

    }
    
}
