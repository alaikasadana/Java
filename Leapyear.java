import java.util.*;
class Leapyear{
    public static void main (String args[]){
    Scanner obj = new Scanner (System.in);
       System.out.println("ENTER A YEAR : ");
       int year = obj.nextInt();
      
       if((year%4==0  &&  year%100 != 0 ) || ( year%400 == 0) ){
        System.out.println(year + " IT IS A LEAP YEAR");
       }

       else{
         System.out.println(year + " IT IS NOT A LEAP YEAR");
       }

    }
}