package algos;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsAlgorithmsMain {
    public static void main(String[] args) {
        ArrayList<Double> f = new ArrayList<Double>();
        
        for(int i = 0; i < 5; ++i){
            f.add(Math.random());
        }
        System.out.println(f);
        Collections.sort(f);
        System.out.println(f);
        Collections.shuffle(f);
        System.out.println(f);
        Double min = Collections.min(f);
        System.out.println(min);
        Double max = Collections.max(f);
        System.out.println(max);
    }
}
