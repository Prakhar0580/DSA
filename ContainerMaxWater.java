import java.util.*;
public class ContainerMaxWater {
    //with optimised method i.e with 2 pointers approach
    public static int func(ArrayList<Integer>height){
        int maxarea=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int wid=rp-lp;
            int area=ht*wid;
            maxarea=Math.max(maxarea,area);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxarea;
    }
    public static void main(String args[]){
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.print(func(height));
    }
}
