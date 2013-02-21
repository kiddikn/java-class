// ファイルCenter.java
public class Center extends LineFilter {
    String processLine(String line) {
        String space40 = "                                        "; // 空白40個
        return space40.substring(line.length()/2)+line;
    }
    public static void main(String[] args) {
        processAllLines(new Center());
    }
}
