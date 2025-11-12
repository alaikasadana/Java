import java.util.*;
class LCM{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
            System.out.println("Enter 1st and smallest no:");
        int num = obj.nextInt();
               System.out.println("Enter 2nd no:");
        int num1 = obj.nextInt();

        int lcm = 0 ;

        for(int i=num1 ;  ; i=i+num1){
            if(i%num== 0 && i%num1== 0){
                lcm = i;
                System.out.println("LCM : " + i);
                break;
            }
        }

          
        

        }
    }
