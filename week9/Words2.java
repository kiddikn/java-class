import java.util.*;

public class Words2 extends Words {
    static Set<String> union(Set<String> a, Set<String> b) { // 2つの集合の和集合を返す
        Set<String> value = new TreeSet<String>(a);  // valueはaのコピー
        for(String s : b){
            if(!value.contains(s))
                value.add(s);
        }
        return value;
    }
    public static void main(String[] args) {
        Set<String> w = new TreeSet<String>(); // 空集合
        for (int i = 0; i < args.length; i++) {
            w = union(w, words(args[i]));
        }
        printSet(w);
    }
}

