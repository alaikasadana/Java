import java.util.*;
class Celsius{
    public static void main(String ar[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Choose one option you want to convert :");
        System.out.println("1. Celsius to Fahrenheit.");
         System.out.println("2. Fahrenheit to Celsius");

         int choice = obj.nextInt();

    
        if (choice == 1) {
            System.out.print("Enter Temperature in Celsius: ");
            double celsius = obj.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + " F");
        } else if (choice == 2) {
            System.out.print("Enter Temperature in Fahrenheit: ");
            double fahrenheit = obj.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius + " C");
        } else {
            System.out.println("Invalid Choice! Please enter 1 or 2.");
        }
    }
}