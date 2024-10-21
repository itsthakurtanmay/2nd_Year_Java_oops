public class functions1 {
 
  public static void addition(){
    int a = 5;
    int b = 10;
    int sum = a+b;
    Subtraction();
    System.out.println(sum);
  }
  
  public static void Subtraction(){
    int a = 5;
    int b = 10;
    int sum = a-b;
    Multiplication();
    System.out.println(sum);
  }
  
  public static void Multiplication(){
    int a = 5;
    int b = 10;
    int sum = a*b;
    division();
    System.out.println(sum);
  }
  
  public static void division(){
    int a = 5;
    int b = 10;
    int sum = a/b;
    System.out.println(sum);
  }
  

  
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      addition();
      System.out.println("finished");
  }

    
}
