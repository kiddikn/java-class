// ファイルAddGt.java
public class AddGt extends LineFilter {
    String processLine(String line) {
        return '>' + line;
    }
    public static void main(String[] args) {
        processAllLines(new AddGt());
    }
}
