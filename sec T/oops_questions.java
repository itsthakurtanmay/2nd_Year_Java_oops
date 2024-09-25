class box{
    double height;
    double width;
    // private double length;
    double length;

    box(double height, double width ,double  length){
        this.height = height;
        this.width = width;
        this.length = length;
    }
    // getter and setter
    public void setlen(double l) throws Exception{
        try{
        if(l<=0){
            throw new Exception("length kvi negative nhi hota hai");
        }
        this.length=l;
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    public double getlen(){
        return length;
    }
    public double volume(){
        return this.length*this.width*this.height;
    }
    static{
        System.out.println("HELLO");
    }
}

public class oops_questions {
    public static void main(String[] args) throws Exception{
        box b1 = new box(2,3,1.5);
        b1.length=-3;
        // b1.setlen(-3);
        double ans = b1.volume();
        // System.out.println(b1.getlen()); 
        System.out.println(ans);
        
    }
    
}
