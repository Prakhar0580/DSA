public class KishanReverseArray {
    public static void main(String args[]){
        
        /*Scanner sc=new Scanner(System.in);
        int n[]=new int[5];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }*/
        int n[]={1,2,3,4,5};
        reverse(n);
        //print
        for(int i=0;i<n.length;i++){
        System.out.print(""+ n[i]);
        }
        System.out.println();

    }
    public static void reverse(int n[]){
        int first=0; 
        int last=n.length-1;
           //swap
        while(first<last){
            int temp=n[first];
            n[first]=n[last];
            n[last]=temp;
            first++;
            last--;
        }
    }
    
}
