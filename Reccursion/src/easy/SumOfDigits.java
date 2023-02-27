package Recursion.Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0){
            return n;
        }
        return sum(n/10) + n%10;
//    static int sum(int n){
//        int sum = 0;
//        do{
//            int num = n % 10;
//            sum = sum + num;
//            n = n / 10;
//            return sum;
//        }while (n!=1);
    }
}
