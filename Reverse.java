import java.util.*;
class Reverse{
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        int num , rv=0;
        System.out.println("enter a number:");
        num=obj.nextInt();
        while(num>0){
            int digit=num%10;
            rv=rv*10+digit;
            num=num/10;
            }
            System.out.println(rv);
    }
}