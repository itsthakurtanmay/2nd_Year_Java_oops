class student{
    String name;
    int rollno;
    int age;
    int mobileNum;
    int dob;
    String address;
    int year;
    char sec;

}
public class oopss {

    public static void main(String[] args) {
        student s = new student();
        s.name = "arun";
        s.rollno = 23;
        s.age = 36;
        s.dob = 1975;
        s.mobileNum = 12345;
        s.address = "noida";

        System.out.println(s.name);

        
    }
}