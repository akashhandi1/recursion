package string;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
//        subseqascii("","abc");
        System.out.println(subasciiSeq("","abc"));
    }

    static void subseq(String p, String up){
         if(up.isEmpty()){
             System.out.println(p);
             return;
         }
         char ch = up.charAt(0);

         subseq(p+ch,up.substring(1));
         subseq(p,up.substring(1));
    }

    static ArrayList<String> subSeq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subSeq(p+ch,up.substring(1));
        ArrayList<String> right = subSeq(p,up.substring(1));

        left.addAll(right);
        return  left;
    }

    static void subseqascii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseqascii(p+ch,up.substring(1));
        subseqascii(p,up.substring(1));
        subseqascii(p + (ch+0),up.substring(1));
    }

    static ArrayList<String> subasciiSeq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subasciiSeq(p+ch,up.substring(1));
        ArrayList<String> second = subasciiSeq(p,up.substring(1));
        ArrayList<String> third = subasciiSeq(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return  first;
    }
}
