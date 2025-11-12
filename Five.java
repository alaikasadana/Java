import java.util.*;
class Five
{

public static void main (String args []){

Scanner obj = new Scanner (System.in);
int a = obj.nextInt();
int b = obj.nextInt();


if(a <= b){
  System.out.println("PASS");
} 
else if ( a >= b) {
     System.out.println("PASS1");
}
else if (a == b){
     System.out.println("PASS2");
}
else if (a!=b){
    System.out.println("PASS3");
}

}
}
