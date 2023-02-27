package Arrays.Intro;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(45345);
//        list.add(4785);
//        list.add(445);
//        list.add(145);
//        list.add(425);
//        System.out.println(list);
//        list.set(1,99999);
//        System.out.println(list);
        System.out.println("Enter elements: ");
        for (int i = 0;i < 5;i++){
            list.add(in.nextInt());
        }
//        System.out.println(list);
        for (int i= 0;i < 5;i++){
            System.out.println(list.get(i));
        }
    }
}
