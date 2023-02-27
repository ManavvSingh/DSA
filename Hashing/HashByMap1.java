package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashByMap1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Array input
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }

//        Pre computation block
        int j = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0;i<arr.length;i++){
            mpp.put(arr[i],++j);
        }
//        Fetch block
        System.out.println("Enter number of queries");
        int q = in.nextInt();
        System.out.println("Enter query");
        for(int i = 0;i<q;i++){
            int number = in.nextInt();
            System.out.println(mpp.get(number));
        }
    }
}
