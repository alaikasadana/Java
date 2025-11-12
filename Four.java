import java.util.*;
class Four 
{

public static void main (String args[])
{
    Scanner objScanner = new Scanner (System.in);

    System.out.println("Enter a no:");
    int a=objScanner.nextInt();

    System.out.println("Enter a char:");
    Character b=objScanner.next().charAt(0);

    System.out.println("Enter a float:");
    float c=objScanner.nextFloat();

    System.out.println("Enter a double:");
    double d=objScanner.nextDouble();

    objScanner.nextLine();

    System.out.println("Enter a String:");
    String e=objScanner.nextLine();

    System.out.println(a+"   "+b+"   "+c+"   "+d+"   "+e+"   ");
     
}
}