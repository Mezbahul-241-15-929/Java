package Method;

public class Method2_with_object {
    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum=" + sum);
    }
    public static void main(String[] args) {
        Method2_with_object obj= new Method2_with_object();
        int a = 10, b = 20;
        obj.sum(a, b);
    }
}
