package Array;
import java.util.Scanner;

public class User_input_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }

        input.close();
    }
}
