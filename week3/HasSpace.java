import java.util.Scanner;

class HasSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("文字列を入力してください。");
        String line = scanner.nextLine();
        int len = line.length();
        int i;
        for (i = 0; i < len; i++) {
            if (line.charAt(i) == ' ') {
                break;   // forループから抜け出す
            }
        }
        if (i >= len) {
            System.out.println("'" + line + "'には空白が含まれていません。");
        } else {
            System.out.println("'" + line + "'には空白が含まれています。");
        }
    }
}
