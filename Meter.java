//meter reading 
//0-50  10rs/unit
//50-100  20rs/unit
//100-150 30rs/unit
//150-200  40rs/unit

import java.util.*;
class Meter {
  public static void main (String ar[]){

    Scanner obj = new Scanner (System.in);
    System.out.println("Enter Meter Reading : ");
    int no = obj.nextInt();

    if(no>0 && no<=50){
        System.out.println(10*no);
    }

     else if(no>50 && no<=100){
        System.out.println(50*10 +(no-50)*20);
    }
 
    else if(no>100 && no<=150){
        System.out.println(50*10 + 50*20 +(no-100)*30);
    }

    else if(no>150 && no<=200){
        System.out.println(50*10 + 50*20 + 50*30 +(no-150)*40);
    }

   else{
    System.out.println("byee!!");
   }

  }
}
