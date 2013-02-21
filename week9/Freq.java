import java.io.*;
import java.util.*;

public class Freq {
    static Map<String,Integer> words(String fileName) {
        Map<String,Integer> map = new TreeMap<String,Integer>();
        try {
            Scanner in = new Scanner(new File(fileName));
            in.useDelimiter("[^a-zA-Z]+");  // 英字以外を読み飛ばす
            while (in.hasNext()) {
                String str = in.next().toLowerCase();
                if (map.containsKey(str)) {
                    // すでに出てきた単語。頻度を増やす。
                    map.put(str, map.get(str) + 1);
                } else {
                    // 初めて出てきた単語。頻度として１を記録。
                    map.put(str, 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File " + fileName + " not found");
        }
        return map;
    }
    static void printMap(Map<String,Integer> m) {
        for (String key : m.keySet()) {
            int value = m.get(key);
            System.out.println(value + ":" + key);
        }
    }
    public static void main(String[] args) {
        printMap(words(args[0]));
    }
}
