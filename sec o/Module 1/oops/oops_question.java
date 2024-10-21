class box{
    double width;
    double height;
    double length;

    //constructor
    box(double width,double height,double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double volume(){
        return this.length*this.height*this.width;

    }

}

public class oops_question {
    public static void main(String[] args) {
        box b1 = new box(2.5,3.5,4.5);
        b1.length = -3.5;
        System.out.println(b1.volume());
        
    }
    
}
