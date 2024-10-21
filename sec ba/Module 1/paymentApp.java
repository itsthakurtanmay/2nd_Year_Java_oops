public class paymentApp {
    public static void main(String[] args) {
        payApp s1 = new payApp("javapay","white",true,true,false,false,false,3); 
        // s1.name = "c++pay";
        s1.setter(true, true, 4);
        System.out.println(s1.getter());
        // System.out.println(s1.name);
        // System.out.println(s1.UIcolor);
        // System.out.println(s1.upiID);
        // System.out.println(s1.toSelfAccount);
        // System.out.println(s1.creditScore);
        // System.out.println(s1.rating);
        // System.out.println(s1.loanProvide);
    }
    
}

class payApp{
    private String name;
    String UIcolor;
    boolean upiID;
    boolean toSelfAccount;
    boolean multipleRecharges;
    private boolean loanProvide;
    private boolean creditScore;
    private int rating;

    //constructor similar as method/function
    //1.No return type;
    //2. class name == constructorname;
    //3.Automatical call;

    payApp(String Appname,String uiColor,boolean Upi,boolean sA,boolean mr,boolean l,boolean credit,int rating){
        this.name = Appname;
        this.UIcolor = uiColor;
        this.upiID = Upi;
        this.toSelfAccount = sA;
        this.multipleRecharges = mr;
        this.loanProvide = l;
        this.creditScore = credit;
        this.rating = rating;
    }

    //setter and getter method;
    public void setter(boolean updatedLoanStatus,boolean updatedCreditStatus,int updatedrating){
        this.loanProvide = updatedLoanStatus;
        this.creditScore = updatedCreditStatus;
        this.rating = updatedrating;
    }

    public int getter(){
        return this.rating;
    }

    

}
