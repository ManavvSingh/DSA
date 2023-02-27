package Arrays.Intro;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Input using for loops

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

//        Input
//        for (int i = 0;i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }

//        Print
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        for each loop
//        for(int elem : arr){
//            System.out.print(elem + " ");
//        }

        String[] str = new String[4];
        for(int i = 0;i < str.length;i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
