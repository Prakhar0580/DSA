import java.util.*;
public class UpperCase_Statement {
    public static void conversion(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));//capitalize the first letter of my statement.
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String str="hi my name is prakhar agarwal";
      conversion(str);
    }
}
