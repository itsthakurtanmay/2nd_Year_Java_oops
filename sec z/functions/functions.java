/**
 * functions
 */
public class functions {
    public  static int addition(){
        int a = 5;
        int b = 10;
        int sum = a+b;
        System.out.println(sum);
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("hello java");
        System.out.println("hello java2");
        System.out.println("hello java3");
        System.out.println("hello java4");
        System.out.println("hello java5");

        int furtherUse = addition();
        System.out.println("hello java3");
        System.out.println("hello java4");
        System.out.println("hello java5");
        System.out.println(furtherUse);
    }
}