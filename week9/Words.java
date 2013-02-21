import java.io.*;
import java.util.*;

public class Words {
    static Set<String> words(String fileName) {
        // ファイル fileName 中の英単語の集合を返す
        Set<String> set = new TreeSet<String>();
        try {
            Scanner in = new Scanner(new File(fileName));
            in.useDelimiter("[^a-zA-Z]+");  // 英字以外を読み飛ばす
            while (in.hasNext()) {
                set.add(in.next().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File " + fileName + " not found");
        }
        return set;
    }
    static void printSet(Set<String> set) {
        // setの内容を出力する
        for (String s : set) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        printSet(words(args[0]));
    }
}

