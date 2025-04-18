package string;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
//        permutations("","abc");
//        ArrayList<String> ans = permutationslist("","abc");
        System.out.println(permutationscount("", "abcde"));

    }

    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permutationslist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();


        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationslist(f+ch+s,up.substring(1)));
        }

        return ans;
    }
    static int permutationscount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int count =0 ;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count+ permutationscount(f+ch+s,up.substring(1));
        }
        return count;
    }
}
