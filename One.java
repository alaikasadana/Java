// Character conversion if the Characteris lowercase to uppercase and vice-versa

import java.util.*;
class One {
    public static void main(String ar[]){

    Scanner obj = new Scanner (System.in);
    System.out.println("Enter a Character :");
    char ch = obj.next().charAt(0);
    
    if(ch>='a' && ch<='z'){
        System.out.println((char)(ch-32));
    }

    else if(ch>='A' && ch<='Z'){
        System.out.println((char)(ch+32));
    }

    }
}
