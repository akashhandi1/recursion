package recurr;

import java.util.Arrays;

public class pattern {
    public static void main(String[] args) {
//        t1(4,0);
        int[] arr = {4,3,2,1};
        ss(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

//    static void t1(int r, int c){
//        if(r == 0){
//            return ;
//        }
//        if(c<r){
//            t1(r,c+1);
//            System.out.print("*");
//
//        }else {
//            t1(r-1,0);
//            System.out.println();
//
//        }
//
//    }

//    static void bs(int[] arr, int r,int c){
//        if(r==0 ){
//            return;
//        }
//        if(c<r){
//            if(arr[c]> arr[c+1]){
//                int temp = arr[c];
//                arr[c] = arr[c+1];
//                arr[c+1] = temp;
//            }
//            bs(arr,r,c+1);
//
//        }
//        else{
//            bs(arr,r-1,0);
//        }
//    }

    static void ss(int[] arr, int r,int c,int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                ss(arr, r, c + 1,c);

            }else {
                ss(arr, r , c+1, max);
            }

        } else {
            int temp = arr[max];
            arr[max] = arr[r-1] ;
            arr[r-1] = temp;
            ss(arr,r-1,0,0);
        }
    }
}
