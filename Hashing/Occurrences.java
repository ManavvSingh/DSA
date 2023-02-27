package Hashing;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Input size
        System.out.println("Enter size");
        int n = in.nextInt();
        int[] arr = {1,2,1,3,2};

//        Input number of queries

        int count = 0;
        int[] hash = new int[13];
        for(int i = 0;i<arr.length;i++){
            hash[arr[i]] += 1;
        }

        System.out.println("Enter no of q");
        int q = in.nextInt();
        for (int i = 0;i<arr.length;i++){
            int num = in.nextInt();
            System.out.println(hash[num]);
        }
}
    }
