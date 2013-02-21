import java.util.*;

public class WordSetCount {
    // Scanner内の単語をすべてコレクションcに加えるクラスメソッド
    static void readIntoCollection(Scanner s, Collection<String> c) {
        while (s.hasNext()) {
            c.add(s.next());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> set = new HashSet<String>();

        readIntoCollection(input,set);
        System.out.println(set.size() + " words.");
    }
}
