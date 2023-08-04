public class inversePattern {
    public static void main(String args[]){
        int line;
        int star;
        for(line=1;line<=4;line++){
            for(star=4;star>=line;star--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(line=1;line<=4;line++){
            for(star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
