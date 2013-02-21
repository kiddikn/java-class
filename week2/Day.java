
import java.util.Scanner;
class Day{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("日付を入力してください。");
        int day = scanner.nextInt();
        if(day >= 1 && day <=31){
            switch(day % 7){
                case 0:
                    System.out.println(day + "日は金曜日です。");
                    break;
                case 1:
                    System.out.println(day + "日は土曜日です。");
                    break;
                case 2:
                    System.out.println(day + "日は日曜日です。");
                    break;
                case 3:
                    System.out.println(day + "日は月曜日です。");
                    break;
                case 4:
                    System.out.println(day + "日は火曜日です。");
                    break;
                case 5:
                    System.out.println(day + "日は水曜日です。");
                    break;
                case 6:
                    System.out.println(day + "日は木曜日です。");
                    break;
            }
        }else{
            System.out.println("日付が正しくありません。");
        }
    }
}
