package Arrays.Intro;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimention {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        int[][] num = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(num));

        int[][] arrMulti = new int[3][3];
        for (int row = 0; row < arrMulti.length; row++){
            for (int col = 0; col < arrMulti[row].length; col++){
                arrMulti[row][col] = sc.nextInt();
            }
        }
        for (int[] elem : arrMulti){
            System.out.println(Arrays.toString(elem));
        }


    }
}
