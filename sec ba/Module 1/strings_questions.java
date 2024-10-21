public class strings_questions {
    public static void main(String[] args) {
        String s = "patanjali";
        String s1 = "patanjali";
        String s2 = new String("patanjali");
        String s3 = new String("patanjali");

        if(s == s1)System.out.println("true");
        else System.out.println("false");
        if(s == s3)System.out.println("true");
        else System.out.println("false");
        if(s2 == s3)System.out.println("true");
        else System.out.println("false");
    }
    
}
