import java.util.*;

class Sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many natural numbers do you want to add? ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter natural number " + i + ": ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Invalid! Only natural numbers (1, 2, 3...) are allowed.");
              
            }

            sum += num;
        }

        System.out.println("Total sum of the entered " + n + " natural numbers = " + sum);
    }
}

