public class Subsets {
    public static void func(String str,int i,String ans){
        //Base Case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //for yes
        func(str,i+1,ans+str.charAt(i));
        //for no
        func(str,i+1,ans);
    }
    public static void main(String args[]){
        String str="abc";
        func(str,0,"");
    }
}
