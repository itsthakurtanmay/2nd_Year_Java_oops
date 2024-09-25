

class Student{
    String name;
    int rollno;
    int year;
    char ch;
    double attendance;
    private double cpi;

    //constructor
    Student(String name,int roll,int yr,char ch,double attendance,double cpi){
        this.name = name;
        this.rollno = roll;
        this.year = yr;
        this.ch = ch;
        this.attendance = attendance;
        this.cpi = cpi;
    }

    //getter and setter
    public void setter(double increasedCpi){
        this.cpi = increasedCpi;
    }
    public double getter(){
        return this.cpi;
    }
}

public class student_code {
    public static void main(String[] args) {
        Student s1 = new Student("Shanjh",53,2,'z',64.5,6.4);

        s1.setter(7.8);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.year);
        System.out.println(s1.ch);
        System.out.println(s1.attendance);
        System.err.println(s1.getter());
        // System.out.println(s1.cpi);
        
    }
    
}
