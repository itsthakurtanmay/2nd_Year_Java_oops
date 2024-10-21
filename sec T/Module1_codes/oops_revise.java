



class fan{
    String fanCompanyName;
    String color;
    int speed;
    int rating;
    int blades;
    boolean condenser;
    int watt;
    boolean motar;

    fan(String fanCompanyName,String color,int speed,int r,int b,boolean c,int w,boolean m){
        this.fanCompanyName = fanCompanyName;
        this.color = color;
        this.speed = speed;
        this.rating = r;
        this.blades = b;
        this.condenser = c;
        this.watt = w;
        this.motar = m;

    }
}

public class oops_revise {
    public static void main(String[] args) {
        fan f1 = new fan("usha","black",500,5,8,true,1000,true);
        f1.motar = false;
        f1.speed = 20;
        System.out.println(f1.fanCompanyName);
        System.out.println(f1.color);
        System.out.println(f1.speed);
        System.out.println(f1.rating);
        System.out.println(f1.blades);
        System.out.println(f1.watt);

       
        
    }
    
}
