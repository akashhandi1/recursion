package recurr;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        numb(num);
    }

//    static void numb(int num){
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i);
//        }
//    }

    static void numb(int n){
        if(n == 5){
            System.out.println(5);
            return ;
        }
        System.out.println(n);
        numb(n+1);
    }
}
