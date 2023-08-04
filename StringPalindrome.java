public class StringPalindrome {
        public static boolean palindrome(String str){
            int n=str.length();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=str.charAt(n-i-1)){
                    return false;
                }
            }
            return true;
        }
    public static void main(String args[]){
        String str="madam";
        boolean var=palindrome(str);
        System.out.print(var);

    }
    
}
