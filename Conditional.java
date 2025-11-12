import java.util.*;
class Conditional{

    public static void main (String args[]){

    Scanner obj = new Scanner (System.in);
    System.out.println("ENTER A NO:");
    int num = obj.nextInt();

    if(num<=20 && num>=1 && num%3==0 && num%2==0){
        System.out.print("YES IT IS TRUE : " +  num);
    }

    else{
        System.out.print("INVALID");
    }

    }
}