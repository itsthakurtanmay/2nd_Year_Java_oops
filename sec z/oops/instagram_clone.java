class User{
    String username;
    String profilepic;
    String bio;

    //constructor
    User(String name,String profilepic,String bio){
        this.username = name;
        this.profilepic = profilepic;
        this.bio = bio;

    }

    //override;
    @Override
    public String toString(){
        return this.username;
    }

    //method -> send follow req;
    public void followReq(User upcomingReq){
        System.out.println(upcomingReq + " send request to " + username);

    }
}

// Class comment{

// }

// Class post{

// }


public class instagram_clone {
    public static void main(String[] args) {
        User u1 = new User("Sumit","Sumit.jpeg","I'm java devloper");
        User u2 = new User("Prashant","prashant.jpeg","I'm python devloper");

        u1.followReq(u2);
        

        
    }
    
}
