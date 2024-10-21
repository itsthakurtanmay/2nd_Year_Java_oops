class building{//parent class
    String buildingname;
    int floor;
    int rooms;
    int whiteboard;

    building(String bn,int flr,int r,int wb){
        this.buildingname = bn;
        this.floor = flr;
        this.rooms = r;
        this.whiteboard = wb;
    }

    void buildingInfo(){
        System.out.println(this.buildingname);
        System.out.println(this.rooms);
        System.out.println(this.floor);
        System.out.println(this.whiteboard);
    }

}

class newBuilding extends building{ //child class
    int smartboard;
    int camera;
    int ac;
    int globalVentillationSystem;
    int lift;

   



}
public class building_making {
    public static void main(String[] args) {
        // building b1 = new building("ab1",5,100,60);

        newBuilding b2 = new newBuilding();
        
    }
    
}
