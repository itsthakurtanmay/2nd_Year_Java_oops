
class building{
    String name;
    int floor;
    int buildingHeight;
    int noOfRooms;
    int windows;
    int washrooms;
    boolean canteen;
    boolean Ac;
    boolean smartlight;
    boolean projector;
    boolean wifi;

    public building(String name,int rooms,boolean Ac,boolean wifi,boolean projector) {
        this.name = name;
        this.noOfRooms = rooms;
        this.Ac = Ac;
        this.wifi = wifi;
        this.projector = projector;
    } 
    
    //method
    public void displayBuildingInfo(){
        System.out.println(this.name);
        System.out.println(this.noOfRooms);
        System.out.println(this.Ac);
        System.out.println(this.wifi);
        System.out.println(this.projector);
    }
    

}

class newbuilding extends building{
    String newBuildingName;
    int lifts;
    int baithakRoom;
    int serverRoom;
    int gamingArea;

    newbuilding(String name,int rooms,boolean Ac,boolean wifi,boolean projector,String bn,int lifts,int baithak,int sr,int gA){
        super(name, rooms, Ac, wifi, projector);
        this.baithakRoom = baithak;
        this.serverRoom = sr;
        this.gamingArea = gA;
        this.lifts = lifts;

    }
}


public class inheritance_code {
    public static void main(String[] args) {
        building b1 = new building("ab1", 100, false, false, false);  
        newbuilding b2 = new newbuilding("ab1", 100, false, false, false,"ab12",10,2,5,2);
        b2.displayBuildingInfo();
     

        
    }
    
}
