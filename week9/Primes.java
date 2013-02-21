import java.util.*;

public class Primes {
    public static void main(String[] args) {
        Set<Integer> nonprime = new HashSet<Integer>();
        for (int i = 2; i < 100; i++) {
            if (! nonprime.contains(i)) {
                // 新しい素数が見つかった
                System.out.println(i);
                // iの倍数を集合に入れる
                for (int j = i + i; j < 100; j += i) {
                    nonprime.add(j);
                }
            }
        }
    }
}
