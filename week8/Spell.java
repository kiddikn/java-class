import java.io.*;
import java.util.*;

public class Spell {
    // Scanner内の単語をすべてコレクションcに加えるクラスメソッド
    static void readIntoCollection(Scanner s, Collection<String> c) {
        while (s.hasNext()) {
            c.add(s.next().toLowerCase());  // 英字をすべて小文字に変換する
        }
    }

    static Scanner fileScanner(String fileName) throws FileNotFoundException {
        return new Scanner(new File(fileName));
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner d = fileScanner("/home/prof/maeda/dict");
        Set<String> dict = new HashSet<String>();

        readIntoCollection(d, dict);

        Scanner input = fileScanner(args[0]);
        input.useDelimiter("[^a-zA-Z]+");  // 単語の区切りを「英字以外の文字の並び」とする
            
        while(input.hasNext()){
            String check = new String(input.next());
            if(!(dict.contains(check))){
                System.out.println(check);   
            }
        }
    }
}
