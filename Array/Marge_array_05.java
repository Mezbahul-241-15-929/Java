package Array;
import java.util.Scanner;

public class Marge_array_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sizes
        System.out.print("Enter size of first array: ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];

        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];

        System.out.print("Enter elements of second array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = input.nextInt();
        }

        // Merge arrays
        int[] merged = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            merged[size1 + i] = arr2[i];
        }

        // Output merged array
        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        input.close();
    }
}

