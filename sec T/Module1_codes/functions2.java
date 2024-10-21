/**
 * functions2
 */
public class functions2 {
    public static int addition(){
        int a = 5;
        int b = 10;
        int c = a+b-sub();

        System.out.println(c);
        return c;
    }

    public static int sub() {
        int a = 9;
        int b = 7;
        int c = a-b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("hello java");
        System.out.println(addition());
    }
}