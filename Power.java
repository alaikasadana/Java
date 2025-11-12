import java.util.*;
class Power{
    public static void main (String args []){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a No :");
    int num = obj.nextInt();
     System.out.println("Enter the power of no :");
    int pow = obj.nextInt();

    int result = 1 ;
    for(int i = 1 ; i<=pow ; i++){
        result *= num ;
    }
        System.out.println(result);
    }
}