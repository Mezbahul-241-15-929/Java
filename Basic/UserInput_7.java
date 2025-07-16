package Basic;
import java.util.Scanner;
//import java.util.*;

public class UserInput_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();           // Integer number
        float b = in.nextFloat();       // Floating number
        double c = in.nextDouble();     // Double number
        String d = in.next();           // A single word
        in.nextLine();                  // Consume leftover newline
        String e = in.nextLine();       // A full line of text
        long f = in.nextLong();         // Long number

        System.out.println("Integer number: " + a);
        System.out.println("Floating number: " + b);
        System.out.println("Double number: " + c);
        System.out.println("Word: " + d);
        System.out.println("Sentence: " + e);
        System.out.println("Long number: " + f);

        in.close();
    }
}
