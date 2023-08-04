import java.util.*;
public class PairSum_ONE {
    public static Boolean func(ArrayList<Integer>list,int target){
        //By using 2 pointer approach
        int lp=0;//lp must be at smallest element
        int rp=list.size()-1;//rp must be at largest element
        while(lp<rp){
            if(target==list.get(lp)+list.get(rp)){
                return true;
            }
        if(list.get(lp)+list.get(rp)>target){
            rp--;
        }else{
            lp++;
        }
    }
    return false;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print(func(list,9));

    }
}
