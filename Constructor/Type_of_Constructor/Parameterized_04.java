package Constructor.Type_of_Constructor;

public class Parameterized_04 {
    int x;

    public Parameterized_04(int a) {
        this.x = a;
    }

    public static void main(String[] args) {
        Parameterized_04 myObj = new Parameterized_04(50);
        System.out.println(myObj.x); //50
    }

}
