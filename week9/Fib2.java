import java.util.*;

public class Fib2 {
    static Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // 空のMap
    static int fib(int n) {
        if (n < 2) {
            return 1;
        } else {
            int v;
            v = 0;
            if(map.containsKey(n-1)){
                v += map.get(n-1);
            }else{
                v += fib(n-1);
            }
            if(map.containsKey(n-2)){
                v += map.get(n-2);
            }else{
                v += fib(n-2);
            }
            map.put(n,v);
            return v;
        }
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("fib(" + n + ") = " + fib(n));
    }
}

