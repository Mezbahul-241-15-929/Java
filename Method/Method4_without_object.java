package Method;

public class Method4_without_object {
    public static int max(int a, int b) {
        int max_value;
        if(a>b) max_value=a;
        else max_value=b;
        return max_value;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        int c=max(a, b);
        System.out.println(c);
    }
}
