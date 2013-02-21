import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("文字列を入力してください。");
        String line = scanner.nextLine();
        int len = line.length();
        int middle = len/2; 
        int j = len -1;
        for(int i = 0;i <= middle;i++){
            char first = line.charAt(i);
            char last  = line.charAt(j);
            j--;
            if(first != last){ 
                System.out.println( "'"+ line + "'は回文ではありません。");
                break;
            }
            if(i >= middle)  System.out.println( "'"+ line + "'は回文です。");               
        }

    }
}
