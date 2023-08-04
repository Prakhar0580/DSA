import java.util.*;
public class Question_1 {  //By 2 pointer approach but it  is not 100% efficient
    public static Boolean func(ArrayList<Integer> list){
        int lp=0;
        int rp=list.size()-1;
        if(list.get(rp)-list.get(lp)>=0){ //list must be  in Assending Order
            while(lp!=rp){
                if(list.get(rp)-list.get(lp)<0){
                    return false;
                }
                lp++;
                rp--;
            }
        }else{ //list is in Decending order
            while(lp!=rp){
                if(list.get(rp)-list.get(lp)>0){
                        return false;
                }
                lp++;
                rp--;
            }
        }
        return true;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(3);
            list.add(2);
            list.add(0);
            System.out.print(func(list));
    }
}
