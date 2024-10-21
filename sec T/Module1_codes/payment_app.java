class paymentApp{
    String CompanyName;
    String UIcolor;
    private int space;
    int rating;
    private int limit;
    boolean loanProvide;
  

    paymentApp(String CompanyName,String color,int space,int r,int l,boolean loan){
        this.CompanyName = CompanyName;
        this.UIcolor = color;
        this.space = space;
        this.rating = r;
        this.limit = l;
        this.loanProvide = loan;
    }

    //setter and getter;

    public void setter(int increasedLimit){
        this.limit = increasedLimit;

    }

    public int getter(){
        return this.limit;
    }
}

public class payment_app {
    public static void main(String[] args) {
        paymentApp software = new paymentApp("bharatpe","black",500,3,10000,false);
        software.setter(25000);
        System.out.println(software.getter());
        
        
    
        
    }
    
}
