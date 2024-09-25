class car{
    String name;
    String model;
    String color;
    String engine;
    int price;
    boolean sunroof;
    boolean alloywheel;
    boolean automatic;
    boolean exhaust;
    boolean seater;
    int speed;

    //constructor;
    car(String carname,String model,String color,boolean sunroof){
        this.name = carname;
        this.model = model;
        this.color = color;
        this.sunroof = sunroof;
        this.speed = 0; //Intial speed 0;


    }


    //method -> feature to accelerate car;
    public void acceleration(int increasedSpeed){
        speed+=increasedSpeed;
        System.out.println(this.name + " now running at the speed of " + speed + " km/hr");

    }

    //method -> feature to break applied

    public void breaking(){
        speed = 0;
        System.out.println("break applied");
    }

    //method -> applying horn
    public void horn(){
        System.out.println("pee pee");
    }

}


public class mini_game_car {
    public static void main(String[] args) {
        car toyota = new car("Innova","crysta","white",false);
        // toyota.name = "fortuner";
        // toyota.model = "legender";
        // toyota.color = "black";
        // toyota.engine = "v8";
        // toyota.price = 60;
        // toyota.sunroof = true;

        System.out.println(toyota.name);
        System.out.println(toyota.model);
        System.out.println(toyota.color);
        System.out.println(toyota.engine);
        System.out.println(toyota.price);
        System.out.println(toyota.sunroof);

        toyota.acceleration(56);
        toyota.horn();
        toyota.breaking();
        toyota.acceleration(34);
        toyota.acceleration(10);
        toyota.breaking();
        toyota.acceleration(120);

        
    }
    
}
