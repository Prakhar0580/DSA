public class Bit_Manupulation {
    public static int getIBit(int i,int bin){
        int bitmask=1<<i;
        if((bin&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIBit(int i, int bin){
        int bitmask=1<<i;
        if((bitmask|bin)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void even_odd(int n){
        if((n&1)==0){
            System.out.print("even");
        }else{
            System.out.print("odd");
        }
    }
    public static void clear_last(int n,int i){
        int bitmask=(~0)<<i;
        System.out.print(n&bitmask);
    }
    public static void range_bits(int i, int j, int n){
        int a,b;
        a=(~0)<<j+1;
        b=(int)Math.pow(2, i)-1;
        int bitmask=a+b;
        System.out.print(n&bitmask);
    }
    public static void main(String args[]){
       //get Ith bit
       //int a=getIBit(2,5);

       //System.out.print(a);

       //setting Ith Bit

     // int b=setIBit(4,5);

      //System.out.print(b);

      //Checking for even or odd

      //even_odd(10);

      //clearing bits from last

        //clear_last(15,2);

        //range of bits
      //  range_bits(1,4,86);

        
    }
}
