package Method;

public class Method4_with_object {
    public int max(int a, int b) {
        int max_value;
        if(a>b) max_value=a;
        else max_value=b;
        return max_value;
    }
    public static void main(String[] args) {
        Method4_with_object obj=new Method4_with_object();
        int a = 10, b = 20;
        int c=obj.max(a, b);
        System.out.println(c);
    }
}
