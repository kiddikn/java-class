class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.0, 5.0);
        Rectangle r2 = new Rectangle(3.0, 3.0);

        System.out.printf("r1の面積は%fです。%n", r1.getArea());
        System.out.printf("r2の面積は%fです。%n", r2.getArea());
        System.out.printf("r1の方がr2より面積が%sですね。%n",
                r1.isLarger(r2) ? "大きい" : "小さい");
    }
}
