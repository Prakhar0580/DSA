public class SudokoRecursion {
    public static boolean isSafe(int arr[][],int row,int col,int digit){
        //check along rows
        for(int j=0;j<=8;j++){
            if(arr[row][j]==digit){
                return false;
            }
        }
        //check along columns
        for(int i=0;i<=8;i++){
            if(arr[i][col]==digit){
                return false;
            }
        }
        //check along grids
        int sr=(row*3)/3;
        int sc=(col*3)/3;
        for(int i=sr;i<=sr+2;i++){
            for(int j=i;j<=sc+2;j++){
                if(arr[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void func(int arr[][],int row,int col){
        int nxtrow=row; int nxtcol=col+1;

        if(col+1==9){
            nxtrow=row+1;
            nxtcol=0;
        }
        //Base case
        if(row==9){
            return;
        }
        if(arr[row][col]==0) {
        for(int digit=1;digit<=9;digit++){
            if(isSafe(arr,row,col,digit)){
                arr[row][col]=digit;
                func(arr,nxtrow,nxtcol);
            }
            
        }
    }else{
        func(arr,row,col+1);
    }
    }
    public static void printarr(int arr[][]){
        for(int i=0;i<=8;i++){
            for(int j=0;j<=8;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
        public static void main(String args[]){
            int sudoko[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        func(sudoko,0,0);
        printarr(sudoko);
        }
       

}
