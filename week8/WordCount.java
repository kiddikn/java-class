import java.util.*;

public class WordCount {
    // Scanner内の単語をすべてコレクションcに加えるクラスメソッド
    static void readIntoCollection(Scanner s, Collection<String> c) {
        while (s.hasNext()) {
            c.add(s.next());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<String> check = new HashSet<String>();
        for (int i = 0;i < args.length; i++) {
            check.add(args[i]);
        }
        if(check.contains("-unique")){
            Set<String> set = new HashSet<String>();
            readIntoCollection(input,set);
            System.out.println(set.size() + " words.");
        }else{
            List<String> list = new LinkedList<String>();
            readIntoCollection(input, list);
            System.out.println (list.size() + " words.");
        }

    }
}
