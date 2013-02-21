// ファイルSwapChar.java
public class SwapChar{
        public static void main(String[] args) {
                    LineFilter.processAllLines(new DoubleFilter(new DoubleFilter(new Replace( '、', '+'),new Replace(',', '、')),new Replace('+',',')));
                        }
}
