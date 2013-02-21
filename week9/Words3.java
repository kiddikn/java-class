import java.util.*;

public class Words3 extends Words {
    static Set<String> diff(Set<String> a, Set<String> b) {
        Set<String> value = new TreeSet<String>();  // 空集合
           for(String s:a) value.add(s);
           for(String s:b)
                if(value.contains(s))
                    value.remove(s);
        return value;
    }
    public static void main(String[] args) {
        printSet(diff(words(args[0]), words(args[1])));
    }
}
