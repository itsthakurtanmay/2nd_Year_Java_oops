class box{
    double width;
    double height;
    double depth;

    box(double  width,double  height,double  depth){
        this.width = width;
        this.height = height;
        this.depth = depth;

    }

    //parameteized method 
    public double volume(){
        return width*height*depth;
    }
}

public class oops_box_question {
    public static void main(String[] args) {
        box b1 = new box(2.5,4.9,2.2);
        b1.depth = -4.5;
        System.out.println(b1.volume());
        
    }
    
}
