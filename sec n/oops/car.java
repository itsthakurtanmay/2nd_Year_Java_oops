class carStructure{
    String name;
    String model;
    String color;
    int speed;
    boolean sunroof;

    //constructor
    carStructure(String carname,String model,String color,boolean sunroof){
        this.name = carname;
        this.model = model;
        this.color = color;
        this.sunroof = sunroof;
        this.speed = 0;//intial speed 0;

    }

    //method to accelerate car;
    public void acceleration(int increasedSpeed){
        speed+=increasedSpeed;
        System.out.println(this.name + " is now running at the speed of "+ speed + " km/hr");

    }
}

public class car {
    public static void main(String[] args) {
        // int a = 5;
        // char ch = 'a';
        carStructure toyota = new carStructure("Innova","Crysta","white",true);
        // toyota.name = "Fortuner";
        // toyota.model = "legender";
        // toyota.color = "black";
        // toyota.sunroof = false;

        System.out.println(toyota.name);
        System.out.println(toyota.model);
        System.out.println(toyota.color);
        System.out.println(toyota.sunroof);
        toyota.acceleration(59);
        
    }
    
}
