import java.util.*;
class Armstrong{
    public static void main(String args[]){
        int number = 153;
        int org = number;
        int sum = 0 ; 

        while(number!=0){
          int digits = number % 10;
          sum = sum+digits*digits*digits;
          number = number /10 ;


        } 
        if (sum==org){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
           }
}