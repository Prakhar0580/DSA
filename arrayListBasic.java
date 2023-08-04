import java.util.*;
public class arrayListBasic {
    public static void reverse(ArrayList<Integer>list){
        int lp=0;
        int rp=list.size()-1;
        for(int i=rp;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        }
        public static void largest(ArrayList<Integer>list){
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<=list.size()-1;i++){
                if(list.get(i)>largest){
                    largest=list.get(i);
                }
            }
            System.out.print(largest);
        }
        public static void swap(ArrayList<Integer>list){
            //in m gonna swap each and every element inside the array list not only some particular given elements
            int lp=0;
            int rp=list.size()-1;
            while(lp<=rp){
                int temp;
                temp=list.get(rp);
                list.set(rp,list.get(lp));
                list.set(lp,temp);
                lp++;
                rp--;
            }
            System.out.print(list);
        }
    public static void main(String args[]){
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        //reverse(list1);
        //largest(list1);
        //swap(list1);
    }
}
