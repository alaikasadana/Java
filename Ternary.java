import java.util.*;
class Ternary

{
    public static void main(String args[]){

Scanner obj = new Scanner (System.in);
System.out.print("ENTER A NUMBER FROM 1 TO 20 : ");
int num=obj.nextInt();
System.out.print((num<=20 && num>=1 && num%3==0 && num%2==0)? num : "Invalid");


    }
}
