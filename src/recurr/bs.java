package recurr;

public class bs {
    public static void main(String[] args) {
        int[] arr = {5,6,8,16,24,81,56,12,45,36};
        int target = 16;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr,int target, int s,int e){
        if(s > e){
            return -1;
        }

        int m = s+(e-s)/2;

        if(arr[m] == target ){
            return m;
        }

        if(arr[m] > target){
            return search(arr,target,s,m-1);
        }

        else{
            return search(arr,target,m+1,e);
        }


    }
}
