public class Largest_String {
    //this line of code is made my by myself 
        public static void largestString(String arr[]){
                String largest=arr[0];
                for(int i=1;i<arr.length;i++){
                    if(largest.compareTo(arr[i])<0){
                        largest=arr[i];
                    }
                }
                System.out.print("your largest string is "+largest);
        }
        public static void main(String[] args) {
            String arr[]={"apple","banana","mango"};
            largestString(arr);
        }
}
