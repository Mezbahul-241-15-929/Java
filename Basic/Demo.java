package Basic;
import java.util.*;

public class Demo {

     public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        System.err.print("Enter First number:");
        int a=in.nextInt();
        
        System.err.print("Enter Second number:");
        int b=in.nextInt();

        int c=a+b;
        System.err.println(a+"+"+b+" = "+c);

     }
}