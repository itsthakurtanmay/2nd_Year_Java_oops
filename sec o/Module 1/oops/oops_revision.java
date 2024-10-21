// class paymentApp{
//     String name;
//     String uiColor;
//     int memorySize;
//     int limit;

//     //constructor
//     paymentApp(String appname,String color,int mem,int limit){
//         this.name = appname;
//         this.uiColor = color;
//         this.limit = limit;
//         this.memorySize = mem;
        
//     }
// }


class paymentApp{
    String name;
    String uiColor;
    private int memorySize;
    int limit;

    //constructor
    paymentApp(String appname,String color,int mem,int limit){
        this.name = appname;
        this.uiColor = color;
        this.limit = limit;
        this.memorySize = mem;
    }

    //getter and setter method
    public void setter(int updatedMemory){//read & write only 
        this.memorySize = updatedMemory;
    }

    public int getter(){ //read - only
        return this.memorySize;
    }
}
public class oops_revision {
    public static void main(String[] args) {
        paymentApp p1 = new paymentApp("Phonepe","purple",40,50000);
        paymentApp p2 = new paymentApp("glapay","blue",15,200000);
        // p2.memorySize = 100;
        // System.out.println(p2.memorySize);
        p2.setter(35);
        System.out.println(p2.getter());
        
    }
    
}
