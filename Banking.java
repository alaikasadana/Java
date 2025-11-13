import java.util.*;
class Banking{
    int bal ;
    int password;


    void show(int password){
             if(password==1234){
                bal = 2900;
                System.out.println("Balance :" + bal);
             }
    }


    void add(int amt){
        bal+=amt;
        System.out.println("Balance :" + bal);
        
    }

        void withdraw(int amt){
        bal-=amt;
        System.out.println("Balance :" + bal);
        
    }


    public static void main(String args[]){
        Banking obj = new Banking();
        Scanner an = new Scanner(System.in);
        System.out.println("Enter the pin:");
        int password = an.nextInt();
        obj.show(password);

        
        int amount= an.nextInt();
        obj.add(amount);

        obj.withdraw(amount);
        
        
    }
}