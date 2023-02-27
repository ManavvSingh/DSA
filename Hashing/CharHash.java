package Hashing;

import java.util.Scanner;

public class CharHash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int[] hash = new int[256];
        for (int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }

        System.out.println("No. of queries");
        int q = in.nextInt();
        for(int i =0;i<q;i++){
            System.out.println("enter q:");
            char c = in.next().charAt(0);
            System.out.println(hash[c]);
        }
    }
}
