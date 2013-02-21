// ファイル Replace.java
public class Replace extends LineFilter {
    char from, to;
    Replace(char from, char to) {
        this.from = from;
        this.to = to;
    }
    String processLine(String line) {
        return line.replace(from, to);
    }
    public static void main(String[] args) {
        processAllLines(new Replace(',', '、'));
    }
}

