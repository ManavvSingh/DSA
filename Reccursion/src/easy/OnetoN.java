package Recursion.Easy;

public class OnetoN {
    public static void main(String[] args) {
        func(5);
    }
    static void func(int n){
        if(n==0){
            return;
        }else {
            func(n - 1);
        }
        System.out.println(n);
    }
}
