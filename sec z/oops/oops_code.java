class student{
    String name;
    int rollno;
    int year;
    char sec;
    int phoneNumber;
    String address;

    public void intro(){
        System.out.println("hello evryone my name is harsh ");
    }
    //constructor
    student(String names,int rollnos,int yrs){
        name = names;
        rollno = rollnos;
        year = yrs;
    }

}
public class oops_code {

    public static void main(String[] args) {
        student s1 = new student("harsh",56,2);
        // s1.name = "harsh";
        // s1.rollno = 29;
        // s1.sec = 'z';
        // s1.phoneNumber = 99778;
        // s1.intro();


        // System.out.println(s1.name);
        // System.out.println(s1.rollno);
        // System.out.println(s1.sec);
        // System.out.println(s1.phoneNumber);
        // System.out.println(s1.address);//null
        // System.out.println(s1.year);//0
        // System.out.println(s1.intro());//0
    }
}