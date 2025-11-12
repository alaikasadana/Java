import java.util.*;
class Months{
    public static void main(String agrs[]){
     Scanner obj = new Scanner(System.in) ;
    System.out.println("Enter a month no :");
     int month = obj.nextInt();

     if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) System.out.println ("TOTAL DAYS : 31 ");
     else if(month==4 || month==6 || month==9 || month==11) System.out.println ("TOTAL DAYS : 30 ");
     else if (month==2)  System.out.println ("TOTAL DAYS : 28 / 29 ");
     else { System.out.println ("INVALID NUMBER");}
 
    }
}