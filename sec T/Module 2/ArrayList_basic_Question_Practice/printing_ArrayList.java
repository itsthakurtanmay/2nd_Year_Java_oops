import java.util.ArrayList;

public class printing_ArrayList {
    public static void addingElementsInArrayList(ArrayList<Integer>al){
        for(int i = 1;i<=10;i++){
            al.add(i);
        }
        System.out.println(al);

    }

    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        addingElementsInArrayList(al);
        
    }
}