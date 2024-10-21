class car{
    String name;
    String model;
    String color;
    int year;
    String engine;
    int price;
    float milage;
    int capacity;
    int speed;

    //constructor
    car(String carname,String model,String color,int year){
        this.name = carname;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = 0; //intially car speed is 0;
    }

    //method -> feature to accelerate car
    public void acceleration(int increasedSpeed){
        speed+=increasedSpeed;
        System.out.println(this.name + " is now running at the speed of "+ speed + " km/hr");

    }

    //method -> break;
    public void breaking(){
        speed = 0;
        System.out.println("break applied");
    }

    //method = horm

    public void horn(){
        System.out.println("pee pee");
    }
}
public class oops {

    public static void main(String[] args) {
        car aman = new car("Gwagan","G3","black",2019);
        // aman.name = "audi";
        // aman.model = "R8";
        // aman.color = "yellow";
        // aman.year = 2024;
        System.out.println(aman.name);
        System.out.println(aman.model);
        System.out.println(aman.color);
        System.out.println(aman.year);
        System.out.println(aman.engine);
        System.out.println(aman.milage);
        System.out.println(aman.price);
        System.out.println(aman.capacity);

        aman.acceleration(56);
        aman.horn();
        aman.breaking();
        aman.acceleration(24);
        aman.acceleration(10);
        aman.horn();
        aman.breaking();
        aman.acceleration(5);
        
    }
}