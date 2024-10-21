
class paymentModel{
    String name;
    String ui;
    boolean Scannaning;
    private int limit;
    boolean loanProvide;

    //constructor
    paymentModel(String appname,String shyam,boolean scan,int limit,boolean loan){
        this.name = appname;
        this.ui = shyam;
        this.Scannaning = scan;
        this.limit = limit;
        this.loanProvide = loan;

    }

    //setter and getter method
    public void setter(int increasedLimit){
        this.limit = increasedLimit;
    }

    public int getter(){
        return this.limit;
    }
}

public class paymentApp {
    public static void main(String[] args) {
        paymentModel s1 = new paymentModel("googlepay","white",true,10000,false);
        // s1.limit = 2000;
        s1.setter(20000);

        System.out.println(s1.name);
        System.out.println(s1.ui);
        System.out.println(s1.Scannaning);
        System.out.println(s1.loanProvide);
        System.out.println(s1.loanProvide);
        // System.out.println(s1.limit);
        System.out.println(s1.getter());
        
    }
    
}
