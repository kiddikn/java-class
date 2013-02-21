// ファイルRightAjust.java
public class RightAdjust extends LineFilter {
    String processLine(String line) {
        String space40 = "                                        "; // 空白40個
        return space40.substring(line.length()) + line;   //substirng(line.length())でスペースのうちline.length()のぞいた分だけ表示
    }
    public static void main(String[] args) {
        processAllLines(new RightAdjust());
    }
}
