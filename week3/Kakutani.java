import java.util.Scanner;

class Kakutani {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("整数を入力してください。");
        int k = scanner.nextInt();
        while (k >= 2) {
            if(k%2 == 0){
                k = k/2;
                count += 1;
            }else if(k%2 == 1){
                k = 3*k + 1;
                count += 1; 
            }
            System.out.println(count + "回: " + k);
        }
        System.out.println( count + "回で1になりました。");
    }
}
