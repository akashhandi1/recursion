package recurr;

import java.sql.SQLOutput;

public class ls {
    public static void main(String[] args) {
        int[] arr= {2,5,8,9,12,48,56,78,2,45};
        System.out.println(lis(arr,49,0));
    }

    static boolean lis(int[] arr, int target,int index){
        if(index==arr.length-1){
            return false;
        }

        return arr[index]==target || lis(arr,target,index+1);
    }
}
