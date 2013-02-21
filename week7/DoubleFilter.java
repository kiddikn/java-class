// ファイルDoubleFilter.java
public class DoubleFilter extends LineFilter {
    LineFilter f1, f2;
    DoubleFilter(LineFilter f1, LineFilter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    String processLine(String line) {
        return f2.processLine(f1.processLine(line));
    }
    public static void main(String[] args) {
        processAllLines(new DoubleFilter(new Rev(),
                    new Center()));
    }
}
