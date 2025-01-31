package recurr;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        numb(num);
    }

    static void numb(int num){
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
