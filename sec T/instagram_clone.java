
import java.util.ArrayList;


class User{
    String userName;
    String profile_Pic;
    ArrayList<User>reqList;

    User(String username,String profilepic) {
        this.userName = username;
        this.profile_Pic = profilepic;
        this.reqList = new ArrayList<>();
    }

    @Override
    public String toString(){
        return this.userName;
    }

    public void sendReq(User user){
        reqList.add(user);
        System.out.println(user + " send req to " + this.userName);
    }
}

// class post{

// }

// class comment{

// }

public class instagram_clone {
    public static void main(String[] args) {
        User user1 = new User("Suraj","Suraj_pic.jpeg");
        User user2 = new User("Jatin","jatin_pic.jpeg");

        user1.sendReq(user2);
        
    }
    
}
