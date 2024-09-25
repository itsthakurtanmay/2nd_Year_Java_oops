class car{
    String name;
    String model;
    String color;
    String type;
    int speed;
    float safteyrating;

    //constructor
    car(String name,String model,String color){
        this.name = name;
        this.model = model;
        this.color = color;
        this.speed = 0; //Intial speed 0
    }

    //method to drive the car;
    public void accelaration(int increasedSpeed){
        speed+=increasedSpeed;
        System.out.println(this.name + " now running at the speed of "+ speed + " km/hr");
    }

    //method to apply break in car;
    public void breaking(){
        speed = 0;
        System.out.println("break applied");
    }

    //car horn;
    public void carhorn(){
        System.out.println("pee pee");
    }
}

public class oops {
    public static void main(String[] args) {
        car myCar = new car("bmw","m5","white");

        System.out.println(myCar.name);
        System.out.println(myCar.model);
        System.out.println(myCar.type);
        System.out.println(myCar.color);
        System.out.println(myCar.speed);
        System.out.println(myCar.safteyrating);

        myCar.accelaration(34);
        myCar.carhorn();
        myCar.breaking();
        myCar.accelaration(45);
        myCar.accelaration(10);
        myCar.breaking();
        myCar.accelaration(5);

        
        
    }
    
}
