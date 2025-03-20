package recurr;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ls {
    public static void main(String[] args) {
        int[] arr= {2,5,8,9,12,48,56,78,2,45,48};
        System.out.println(lis(arr,48,0));
        System.out.println(findindex(arr,48,0));
        ArrayList<Integer> ans = findallindex(arr,48,0,new ArrayList<>());
        System.out.println(ans);
    }

    static boolean lis(int[] arr, int target,int index){
        if(index==arr.length-1){
            return false;
        }

        return arr[index]==target || lis(arr,target,index+1);
    }

    static int findindex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }

        return findindex(arr,target,index+1);
    }

//    static ArrayList<Integer>  list = new ArrayList<>();
//    static void findallindex(int[] arr, int target, int index) {
//        if (index == arr.length ) {
//            return;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        findallindex(arr, target, index + 1);
//
//    }

    static ArrayList<Integer> findallindex(int[] arr,int target,int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        return findallindex(arr, target, index+1, list);
    }
}
