package Recursion.Easy;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        func(n);
    }
//    Sol:
    static void func(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }
//    My approach:
//    static int func(int n){
//        if(n==1){
//            System.out.println(n);
//            return n;
//        }
//        System.out.println(n);
//        return func(n-1);
//    }
}
