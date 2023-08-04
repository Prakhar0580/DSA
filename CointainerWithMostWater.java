import java.util.*;
public class CointainerWithMostWater {
    //By Brute Force Method
    public static void func(ArrayList<Integer>height){
        int maxarea=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int wid=j-i; //to find the width of container
                int ht=Math.min(height.get(i),height.get(j)); //to find the height of container
                int area=wid*ht;
                 maxarea=Math.max(area,maxarea);
            }
        }
        System.out.print(maxarea);
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        func(height);
        

    }
}
