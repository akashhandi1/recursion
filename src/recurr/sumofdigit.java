package recurr;

public class sumofdigit {
    public static void main(String[] args) {
        System.out.println(pro(1342));
    }
//    static int sod(int n){
//        if(n==0){
//            return 0;
//        }
//
//        return (n%10) + sod(n/10);
//    }

    static int pro(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) * pro(n/10);
    }

}
