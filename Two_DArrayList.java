import java.util.*;
public class Two_DArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainlist.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainlist.add(list2);
        //System.out.print(mainlist);
        for(int i=0;i<=mainlist.size()-1;i++){
            ArrayList<Integer> currList=mainlist.get(i);
            for(int j=0;j<=currList.size()-1;j++){
                System.out.print(currList.get(j)*3+" ");
            }
            System.out.println("");
        }
        System.out.print(mainlist);

        
    }
}
