
class pen{
    String penCompanyName;
    String penType;
    String bodyColor;
    float penTipSize;
    int price;
    int dimensions;

    pen(String name,String penType,String color,float size,int price,int d){
        this.penCompanyName = name;
        this.penType = penType;
        this.penTipSize = size;
        this.bodyColor = color;
        this.dimensions = d;
        this.price = price;


    }
}


public class oops_revision {
    public static void main(String[] args) {
        pen p1 = new pen("Doms","gel","black",0.5f,3,6);
    p1.price = 100;
    p1.penTipSize = -5;
        System.out.println(p1.penCompanyName);
        System.out.println(p1.penType);
        System.out.println(p1.bodyColor);
        System.out.println(p1.penTipSize);
        System.out.println(p1.dimensions);
        System.out.println(p1.price);

        
    }
    
}


