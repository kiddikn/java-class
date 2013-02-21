//ParabolaGraph2.java
public class ParabolaGraph2 extends ParabolaGraph{
    public static void main(String[] args){
        (new ParabolaGraph2()).drawAll();
    }

    void drawLine(int x, int y) {
        System.out.printf("%3d:", x);
        for (int i = 0; i < y; i++) {
            System.out.printf(" ");
        }
        System.out.printf("★\n");
    }
}
