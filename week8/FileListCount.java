import java.io.*;
import java.util.*;

public class FileListCount {
    // Scanner内の単語をすべてコレクションcに加えるクラスメソッド
    static void readIntoCollection(Scanner s, Collection<String> c) {
        while (s.hasNext()) {
            c.add(s.next());
        }
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File(args[0]));
            List<String> list = new LinkedList<String>();

            readIntoCollection(input, list);
            System.out.println(list.size() + " words.");
        } catch (FileNotFoundException e) {
            System.err.println("File " +  args[0] + " not found.");
        }
    }
}
