import java.util.*;
public class Pair_Sum_TWO {
    public static Boolean func(ArrayList<Integer> list,int target){
        int pivot=0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                 pivot=i;
            }
        }
        int lp=pivot+1;//must be at smallest elemlent
        int rp=pivot;//must be at largest element
        while(lp!=rp){
            if(target==list.get(lp)+list.get(rp)){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%list.size();
            }else{
                rp=(list.size()+rp-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.print(func(list,27));
    }
}
