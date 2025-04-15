package string;

public class Stream {
    public static void main(String[] args) {
//        skip("","bccadah");
        System.out.println(skipappnotapple("bccappkedah "));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }

    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }

    }

    static String skipappnotapple(String up){
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipappnotapple(up.substring(5));
        }else{
            return up.charAt(0) + skipappnotapple(up.substring(1));
        }

    }
}
