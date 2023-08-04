import java.util.*;//My own logic with iterative method(Brute fOrce method) not 100% Efficient
public class Question1 {
    public static Boolean func(ArrayList<Integer> list){
            for(int i=0;i<=list.size()-2;i++){
                int j=i+1;
                    if(list.get(i)<=list.get(j)){ //list is in Assending order
                        while(j<=list.size()-1){
                            if(list.get(i)>list.get(j)){
                                return false;
                            }
                            j++;
                        }
                      
                    }else{ //list is in Descending order
                        while(j<=list.size()-1){ 
                            if(list.get(i)<list.get(j)){
                                return false;
                            }
                            j++;
                        }
                    }
            }
            return true;
    }
        public static void main(String args[]){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(3);
            list.add(2);
           // list.add(4);
           // list.add(3);
            System.out.print(func(list));

        }
}
