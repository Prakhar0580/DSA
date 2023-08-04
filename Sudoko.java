public class Sudoko {
    public static boolean IsSafe(int arr[][],int digit,int row,int col){
        //check along col
        for(row=0;row<=8;row++){
            if(arr[row][col]==digit){
                return false;
            }
        }
        //check along row
        for(col=0;col<=8;col++){
            if(arr[row][col]==digit){
                return false;
            }
        }
        //check along small box
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<=sr+2;sr++){
            for(int j=sc;j<=sc+2;sc++){
                if(arr[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void func(int arr[][],int row,int col){
                for(row=0;row<=8;row++){
                    for(col=0;col<=8;col++){
                        if(arr[row][col]==0){
                            for(int digit=1;digit<=9;digit++){
                                if(IsSafe(arr,digit,row,col)){
                                    arr[row][col]=digit;
                                    break;
                                }
                            }
                        }
                    }
                }
        }   
        public static void printarr(int arr[][]){
            for(int i=0;i<=8;i++){
                for(int j=0;j<=8;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println(" ");
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
        /*System.out.print("Enter the values inside sudoko");
        for(int i=0;i<=8;i++){
            for(int j=0;j<=8;j++){
                sudoko[i][j]=sc.nextInt();
            }
            System.out.println("");
        }*/
       
        func(sudoko,0,0);
        printarr(sudoko);
    }
}
