public class global_Scope_func {
    static  int val = 100;

    public static void main(String[] args) {
        System.out.println("hello");
        int a = 7;
        int b = 11;
        System.out.println(val);
        System.out.println(add(a,b));
        System.out.println(val);
        
    }

    public static int add(int a,int b){
        int c = a+b;
        // int val = 60;
        val = val+5;
        return c - sub(c,b);
    }
    public static int sub(int a,int b){
        int c = a-b;
        return c;
    }
    
}
