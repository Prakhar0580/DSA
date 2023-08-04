import java.util.*;
public class leapYear {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int year=sc.nextInt();
          if(year%4==0){
            if(year%100==0){
                      if(year%400==0){
                        System.out.println("YEAH! it's a Leap Year");
                      }
                      else{
                        System.out.println("OOPS not a Leap Year");
                      }
            }
            else{
                System.out.println("YEAH! it's a Leap Year");
            }
          }
          else{
            System.out.println("OOPS not a Leap year");
          }
    }
    
}
