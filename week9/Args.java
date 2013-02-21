import java.util.*;

public class Args {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>();
        // コマンドライン引数でmapを更新
        for (int i = 0;i < args.length; i += 2) {
            map.put(args[i], args[i + 1]);
        }

        // 値を取り出す
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
