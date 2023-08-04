public class Spiral_Matrix {
    public static void Spiral(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int strRow=0;
        int endRow=n-1;
        int strCol=0;
        int endCol=m-1;
        while(strCol<=endCol && strRow<=endRow){
            //for printing rows from left to right
            for(int i=strCol;i<=endCol;i++){
                System.out.print(arr[strRow][i]+" ");
            }
            //for printing columns from top to bottom
            for(int j=strRow+1;j<=endRow;j++){
                System.out.print(arr[j][endCol]+" ");
            }
            //for printing rows from right to left
            for(int i=endCol-1;i>=strCol;i--){
                System.out.print(arr[endRow][i]+" ");
            }
            //for printing columns from bottom to top
            for(int j=endRow-1;j>=strRow+1;j--){
                System.out.print(arr[j][strCol]+" ");
            }
            strRow++;
            endRow--;
            strCol++;
            endCol--;
        }
    }
        public static void main(String[] args) {
            int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            Spiral(matrix);

        }
}
