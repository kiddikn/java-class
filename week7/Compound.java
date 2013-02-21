// ファイルCompound.java
public class Compound {
    public static void main(String[] args) {
        LineFilter.processAllLines(new DoubleFilter(new Rev(),(new DoubleFilter(new Center(),new AddGt()))));
    }
}

