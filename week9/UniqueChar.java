import java.util.*;

class UniqueChar {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < args.length; i++) {
            String str = args[i];
            for(int j = 0;j < str.length(); j++){
                if(!(set.contains(str.charAt(j)))){
                    set.add(str.charAt(j));
                    System.out.print(str.charAt(j));
                }
            }
        }
        System.out.println();
    }
}
