package Constructor.Type_of_Constructor;

public class Parameterized_05 {
    int height;
    int width;

    public Parameterized_05(int a,int b){
        System.out.println("Box Created.");
        this.height=10;
        this.width=20;
    }
    public static void main(String[] args) {
        Parameterized_05 box1= new Parameterized_05(23,34);
        System.out.println("Box Height: "+box1.height);  //23
        System.out.println("Box Height: "+box1.width);  //34

        Parameterized_05 box2= new Parameterized_05(22,66);
        System.out.println("Box Height: "+box2.height);  //22
        System.out.println("Box Height: "+box2.width);  //66
    }
}
