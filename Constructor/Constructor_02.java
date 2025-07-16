package Constructor;

public class Constructor_02 {
    int a;

    public Constructor_02(){
        a=34;
    }

    public static void main(String[] args) {
        Constructor_02 obj1= new Constructor_02();
        System.out.println(obj1.a);  //34
    }
}
