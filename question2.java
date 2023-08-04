public class question2 {
    public static int count(int arr[][]){
        int sum=0;
        //my Brute force method 
        /*for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==1){
                    sum+=arr[i][j];
                }
            }
        }*/
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[1][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,1,1,1},{1,2,2,1},{3,2,1,0}};
        int sum=count(matrix);
       System.out.print("the value of elements of sum is"+" "+sum);
    }
}
