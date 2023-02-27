package Recursion.Intro;
//Write a function to print hello world 3 times.
// You can call the function only once in main.
public class MessageExample {
    public static void main(String[] args) {
        msg1();
    }

    static void msg1(){
        System.out.println("hello world");
        msg2();
    }

    static void msg2(){
        System.out.println("hello world");
        msg3();
    }

    static void msg3(){
        System.out.println("hello world");

    }
}
