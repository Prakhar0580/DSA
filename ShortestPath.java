public class ShortestPath {
    public static float shortestpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x--;
            }else if(str.charAt(i)=='E'){
                x++;
            }else if(str.charAt(i)=='N'){
                y++;
            }else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String str="WWNNEESWWWE";
        float path=shortestpath(str);
        System.out.print("The value of shortest path is "+path);

    }
}
