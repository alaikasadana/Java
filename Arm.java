import java.util.*;
class Arm{

    static void armstrong(int number , int org , int sum){
    

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
    


    public static void main(String ar[]){
     Scanner obj = new Scanner(System.in);
      int number = obj.nextInt();
      int org = number;
      int sum = 0 ;

      armstrong(number,org,sum);
    }
}