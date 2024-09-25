public class parameterized_Func {
    public static void main(String[] args) {
        System.out.println("hello java");
        int a = 7;
        int b = 10;
        System.out.println(addition(a,b));
    }

    public static int addition(int a,int b){
        int c = a+b;
        return c - sub(c,b);
    }

    public static int sub(int a,int b){
        int c = a-b;
        return c;
    }

    
}
