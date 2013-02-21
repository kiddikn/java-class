import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("整数を入力してください。");
        int num = scanner.nextInt();
        if ((num % 2) == 0) {
            System.out.println(num + "は偶数です。");
        } else {
            System.out.println(num + "は奇数です。");
        }
    }
}
