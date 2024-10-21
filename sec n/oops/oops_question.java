class box{
    double width;
    double depth;
    double height;

    //constructor
    box(double width,double d,double height){
        this.width = width;
        this.depth = d;
        this.height = height;
    }

    public double volume(){
        return width*depth*height;
    }
}
public class oops_question {
    public static void main(String[] args) {
        box b1 = new box(2.4,4.5,7.8);
        b1.width = -8;
        System.out.println(b1.volume());

        
    }
    
}
