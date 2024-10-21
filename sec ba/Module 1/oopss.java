class student{
    String name;//null
    int rollNo;//0
    int age;
    int year;
    char sec;
    String gender;
    public void selfInto(){
        System.out.println("hello my name is : "+name);
    }

    //constructor
    student(String name,int rollNo,int age,int year,char sec){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.year = year;
        this.sec = sec;
        
    }

    //Multiple constructor
    

}

public class oopss {
    public static void main(String[] args) {
        student s1 = new student("ram",34,21,4,'f');
        // s1.name = "aditya";
        // s1.rollNo = 1;
        // // s1.age = 20;
        // s1.year = 2;
        // s1.sec = 'z';
        // s1.gender = "male";

        s1.selfInto();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.year);
        System.out.println(s1.sec);
        System.out.println(s1.gender);


       


        
    }
    
}
