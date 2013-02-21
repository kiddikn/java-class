// ファイルLineFilter.java
import java.util.Scanner;

public class LineFilter {
    // サブクラスでオーバーライドすべきメソッド．
    String processLine(String line) {
        // このクラスでは，何の変換もせずそのまま返す．
        return line;
    }
    final static void processAllLines(LineFilter lf) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 1行読み取って，processLineで変換して出力する．
            String line = scanner.nextLine();
            System.out.println(lf.processLine(line));
        }
    }
    public static void main(String[] args) {
        processAllLines(new LineFilter());
    }
}
