class Student{
    String name;
    int rollno;
    private int cpi;

    Student(String n,int roll,int cpi){
        this.name = n;
        this.rollno = roll;
        this.cpi = cpi;
    }

    //getter and setter;
    public void setter(int cpi){
        this.cpi = cpi;
    }

    public int getter(){
        return cpi;

    }
}

public class student_oops {
    public static void main(String[] args) {
        Student s1 = new Student("amit",24,7);
        
        // s1.cpi = 9;
        s1.setter(8);
        System.out.println(s1.getter());
        // System.out.println(s1.cpi);
        
    }
    
}
