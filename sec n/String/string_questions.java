public class string_questions {
    public static void main(String[] args) {
        String s = "ramlal";
        String s1 = "ramlal";
        String s2 = new String("ramlal");
        String s3 = new String("ramlal");

        if(s == s1)System.out.println("true");
        else System.out.println("false");
        if(s == s2)System.out.println("true");
        else System.out.println("false");
        if(s2 == s3)System.out.println("true");
        else System.out.println("false");
    }
    
}
