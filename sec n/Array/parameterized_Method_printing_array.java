public class parameterized_Method_printing_array {
    public static void displayArray(int []arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("this time printing array by using parameterized methods : ");
        displayArray(arr);
        
    }
}
