package recurr;

public class revno {
    public static void main(String[] args) {

        System.out.println(rev2(1824));
    }
//    static int sum=0;
//    static void rev(int n){
//        if(n==0){
//            return ;
//        }
//        int rem=n%10;
//        sum = sum*10+rem;
//        rev(n/10);
//    }
    static int rev2(int n){
        int digits = (int)(Math.log10(n)) +1 ;
        return helper(n,digits);
    }

    static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return (int) ((int)rem * (Math.pow(10,digits-1)) +helper(n/10,digits-1));
    }

}
