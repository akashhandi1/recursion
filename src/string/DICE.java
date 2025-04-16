package string;

import java.util.ArrayList;

public class DICE {
    public static void main(String[] args) {
        System.out.println(diceface("",3 ,1));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> diceret(String p, int target) {
        if (target == 0 ) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        ArrayList<String> list = new ArrayList<>();


        for (int i = 1; i <= 6 && i <= target ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(diceret(p + i,target- i));
        }
        return list;
    }

    static ArrayList<String> diceface(String p, int target,int face) {
        if (target == 0 ) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        ArrayList<String> list = new ArrayList<>();


        for (int i = 1; i <= face && i <= target ; i++) {
            list.addAll(diceface(p + i,target- i,face));
        }
        return list;
    }
}
