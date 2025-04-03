package sorting;

import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
//        sort(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);// quick sort (heap and insertion sort)
        System.out.println(Arrays.toString(arr));
    }

    static void sort1(int[] nums,int low,int hi){
        if(low>= hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s <= e){
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        sort1(nums,low,e);
        sort1(nums,s,hi);
    }
}
