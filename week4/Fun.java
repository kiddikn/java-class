public class Fun {
    int f(int x) {
        return x;
    }
    void print() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d%n", f(i));
        }
    }
}
