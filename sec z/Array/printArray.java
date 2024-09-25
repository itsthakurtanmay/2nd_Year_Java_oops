public class printArray {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 1; 
        arr[1] = 2; 
        arr[2] = 12; 
        arr[3] = 25; 
        arr[4] = 35;
        // arr[5] = 45; //Index out of bound;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // System.out.println(arr[5]);
    }
}