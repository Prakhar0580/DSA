import java.util.*;// solution.pdf
public class Q1 {
    public static Boolean func(ArrayList<Integer> list){
        Boolean incr=true;
        Boolean dec=true;
        for(int i=0;i<=list.size()-2;i++){
            if(list.get(i)>list.get(i+1)){
                incr=false;
            }
            if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }
        return incr||dec;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(4);
        list.add(1);
        System.out.print(func(list));
    }
}
