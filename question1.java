public class question1 {
    public static int counting(int arr[][]){
        int count=0;    
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]==7){
                        count++;
                    }
                }
            }
            return count;
    }
    public static void main(String args[]){
        int matrix[][]={{1,5,7,9},{2,7,0,1},{1,7,7,0}};
        int count=counting(matrix);
        System.out.print("The number 7 is repeated"+" "+count+" "+"number of times");
    }
}
