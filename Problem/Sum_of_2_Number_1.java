package Problem;

import java.util.*;

public class Sum_of_2_Number_1 {
     public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        System.err.print("Enter First number:");
        int a=in.nextInt();
        
        System.err.print("Enter Second number:");
        int b=in.nextInt();

        int c=a+b;
        System.err.println(a+" + "+b+" = "+c);

     }
}