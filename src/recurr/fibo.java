package recurr;

import java.util.Scanner;
import java.util.Stack;

public class fibo {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        System.out.println(fibonaccino(50));
    }


    static int fibonaccino(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
//    static int  fib(int n){
//        if(n<2){
//            return n;
//        }
//        return fib(n-1)+fib(n-2);
//    }
}
