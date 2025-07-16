package Problem;

public class Maximum_of_3_Number_5 {
        public static void main(String[] args) {
        int a=23,b=4,c=3;
        if(a>b && a>c){
            System.out.println(a+" is Largest Number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is Largest Number");
        }
        else{
            System.out.println(c+" is Largest Number");
        }
    }
}
