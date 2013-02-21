// ファイルRev.java
public class Rev extends LineFilter {
    String processLine(String line) {
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            result = result+line.charAt(line.length()-1-i);
        }
        return result;
    }
    public static void main(String[] args) {
        processAllLines(new Rev());
    }
}

