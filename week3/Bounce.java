import java.util.Scanner;

class Bounce {
    public static void main(String[] args) {
        double h = 3776.0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("反発係数を入力して下さい。");
        double e = scanner.nextDouble();
        while (h >= 1) {
            h = e * e * h;
            count += 1;
            System.out.println(count + "回: " + h + "m");
        }
        System.out.println("ぜんぶで" + count + "回バウンドしました。");
    }
}
