package lists;

import java.util.ArrayList;

public class FindMainStrings {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Sam");
        l.add("le");
        l.add("s");
        String min = l.get(0);
        for (String s : l) {
            if(min.compareTo(s) < 0){
                min = s;
            }
            
        }
        System.out.println(min);
    }
}
