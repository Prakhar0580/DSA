public class question3 {
    public static void transpose(int arr[][]){
        int trans[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               //same matrix will come because with this method matrix will get transpose two times due to which answer will come same 
                /*if(i!= j){
                    temp=arr[j][i];
                    arr[j][i]=arr[i][j];
                    arr[i][j]=temp;
                }*/
                trans[j][i]=arr[i][j];

            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(trans[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void print_arr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
    }
}
    public static void main(String[] args) {
            int matrix[][]={{1,2,3,4},{4,3,2,1},{5,6,7,8},{6,5,8,7}};
            print_arr(matrix);
           System.out.println("array after the transpose :");
            transpose(matrix);

            
    
}

}
