package Method;

public class Maximum_element {
    public static int maxValue(int arr2[]) {
        int maxVal = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (maxVal < arr2[i]) {
                maxVal = arr2[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr = { 12, 33, 22, 56 };

        // for(int i:arr){
        // System.out.println(i);
        // }

        int c = maxValue(arr);
        System.out.println(c);
    }
}
