import java.util.*;

public class WordListCount {
    // Scanner内の単語をすべてコレクションcに加えるクラスメソッド
    static void readIntoCollection(Scanner s, Collection<String> c) {
        while (s.hasNext()) {
            c.add(s.next());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new LinkedList<String>();

        readIntoCollection(input, list);
        System.out.println (list.size() + " words.");
    }
}
