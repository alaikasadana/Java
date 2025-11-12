import java.util.*;
class HCF{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
            System.out.println("Enter 1st smallest no:");
        int num = obj.nextInt();
               System.out.println("Enter 2nd no:");
        int num1 = obj.nextInt();

        int hcf = 0;

        for(int i=1; i<=num ; i++){
            hcf=i;
        }

        System.out.println("HCF :  " + hcf);

        

        
    }
}