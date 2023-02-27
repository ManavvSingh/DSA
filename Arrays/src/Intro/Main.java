package Arrays.Intro;

public class Main {
    public static void main(String[] args) {
        // Collection of similar data items
        // Syntax:
        // datatype[] variable_name = new datatype[size]

        int[] arr = new int[5];
        int[] arr1 = {3,4,5,6};

        int[] rol; // Declaration of array. rollNo is getting defined in stack
        rol = new int[5]; // Initialization of array. actual object is being created in heap
        System.out.println(rol[1]); // [0,0,0,0,0] in heap memory until initialized

        // String array
    }
}
