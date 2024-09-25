public class string_quiz {
    public static void main(String[] args) {
        String s = "shyam";//String Literals
        String s1 = "shyam";
        String s2 = new String("shyam");//by using new keyword
        String s3 = new String("shyam");
        if(s == s1)System.out.println("true");
        else System.out.println("false");
        if(s == s3)System.out.println("true");
        else System.out.println("false");
        if(s2 == s3)System.out.println("true");
        else System.out.println("false");
    }
    
    
}
