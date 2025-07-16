package Constructor.Type_of_Constructor;


public class No_Arg_Constructor_03 {
    int height;
    int width;

    public No_Arg_Constructor_03(){
        System.out.println("Box Created.");
        this.height=10;
        this.width=20;
    }

    public static void main(String[] args) {
        No_Arg_Constructor_03 box1= new No_Arg_Constructor_03();
        System.out.println("Box Height: "+box1.height);  //10
        System.out.println("Box Height: "+box1.width);  //20

        No_Arg_Constructor_03 box2= new No_Arg_Constructor_03();
        System.out.println("Box Height: "+box2.height);  //10
        System.out.println("Box Height: "+box2.width);  //20
    }
}
