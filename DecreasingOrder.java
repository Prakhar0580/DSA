public class DecreasingOrder {
    public static int decreasing(int n){
        if(n==1){
            return 1;
        }
        n=decreasing(n-1);
        System.out.print(n+" ");
        return n+1;

    }
    public static void main(String args[]){
        decreasing(10);
    }
    
}
