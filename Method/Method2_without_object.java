package Method;

public class Method2_without_object {
    public static void sum(int a,int b) {
        int sum=a+b;
        System.out.println("Sum="+sum);
    }

    public static void main(String[] args) {
        int a=10,b=20;
        sum(a,b);
    }
}
