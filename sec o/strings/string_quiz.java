public class string_quiz {
    public static void main(String[] args) {
        String s = "helloworld";
        String s1 = "helloworld";
        String s2 = new String("helloworld");
        String s3 = new String("helloworld");
        if(s == s1)System.out.println("true");
        else System.out.println("false");
        if(s == s3)System.out.println("true");
        else System.out.println("false");
        if(s2 == s3)System.out.println("true");
        else System.out.println("false");
    }
    
}
