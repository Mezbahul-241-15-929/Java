package Constructor.Type_of_Constructor;


public class No_Arg_Constructor_02 {
    int a;

    public No_Arg_Constructor_02(){
        a=34;
    }

    public static void main(String[] args) {
        No_Arg_Constructor_02 obj1= new No_Arg_Constructor_02();
        System.out.println(obj1.a);  //34
    }
}
