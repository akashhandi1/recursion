package recurr;

public class rbs {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,0, arr.length-1,2));
    }

    static int search(int[] arr,int s, int e,int tar){
        if(s>e){
            return -1;
        }

        int m= s+((e-s)/2);
        if(arr[m] == tar){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(tar >= arr[s] && tar <= arr[m]){
                return search(arr,s,m-1,tar);
            }
            else{
                return search(arr,m+1,e,tar);
            }
        }
        if(tar >= arr[m] && tar <= arr[e]){
            return search(arr,m+1,e,tar);
        }

        return search(arr,s,m-1,tar);
    }
}
