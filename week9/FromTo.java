import java.util.*;

public class FromTo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        // 初期値を与えておく
        map.put("-from", 1);
        map.put("-to", 10);
        map.put("-step", 1);

        // コマンドライン引数でmapを更新
        for (int i = 0;i < args.length; i += 2) {
            map.put(args[i], Integer.parseInt(args[i + 1]));
        }

        // 値を取り出す
        int from = map.get("-from");
        int to = map.get("-to");
        int step = map.get("-step");
        for (int i = from; i <= to; i += step) {
            System.out.println(i);
        }
    }
}
