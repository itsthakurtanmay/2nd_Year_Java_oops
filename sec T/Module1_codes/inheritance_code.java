class parent{
    int d1=10;
    int d2=20;
    public void f1(){
        System.out.println("I'm f1 in parent");
    }
    public void f2(){
        System.out.println("I'm f2 in parent");
    }

    
}

class child extends parent{
    int d1=100;
    int d3=200;
    public void f1(){
        System.out.println("I'm f1 in child");
    }
    public void f3(){
        System.out.println("I'm f3 in child");       
    }
}

public class inheritance_code {
    public static void main(String[] args) {
        // case 1
        parent obj=new child();
        System.out.println(obj.d1);
        // System.out.println(obj.d3);
         System.out.println(((child)(obj)).d3);
    }
    
}
