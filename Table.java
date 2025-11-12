import java.util.*;
class Table {
    public static void main(String ar[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a NUMBER:");
        int a = obj.nextInt();

        
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
