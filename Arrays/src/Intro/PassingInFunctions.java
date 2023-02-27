package Arrays.Intro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] num = {34,54,44,23};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0] = 67;
    }
}
