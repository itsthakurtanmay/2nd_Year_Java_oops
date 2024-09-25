class User{
    String userName;
    String profile_pic;
    String bio;

    //Constructor
    User(String userName,String profilePic,String bio){
        this.userName = userName;
        this.profile_pic = profilePic;
        this.bio = bio;
    }

    @Override
    public String toString(){
        return this.userName;
    }
    
    //method to follow req;
    public void sendReq(User user){
        System.out.println(user + " send request to "+ this.userName);
    }
}

// class post{

// }

// class comment{

// }


public class instagram_clone {
    public static void main(String[] args) {
        User user1 = new User("Deepesh","Deepesh_pic.jpeg","I am java devloper");
        User user2 = new User("Saniya","Saniya_pic.jpeg","I am python devloper");

        user1.sendReq(user2);

        
    }
    
}
