// ファイルHasGetAreaMethod.java
interface HasGetAreaMethod {
    double getArea();
}

// ファイルPrintArea.java
class PrintArea {
    static void printArea(HasGetAreaMethod h) {
        System.out.println("面積は" + h.getArea() + "です。");
    }
}

// ファイルCircle.java (変更)
class Circle extends Shape implements HasGetAreaMethod {
    double x0, y0, r;  // 中心座標(x0, y0), 半径r
    Circle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }
    boolean inside(double x, double y) {
        return (x - x0) * (x - x0) + (y - y0) * (y - y0) <= r * r;
    }
    final double PI = 3.14159265359;
    public double getArea() {
        return PI * r * r;
    }
}

// ファイルCircleTest2.java
class CircleTest2 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, 5.0, 3.0);
        Draw.draw(c, 0.0, 10.0, 0.25,
                0.0, 10.0, 0.5);
        PrintArea.printArea(c);
    }
}

//ファイルRectangleTest2.java
class Rectangle extends Shape implements HasGetAreaMethod{
    double left, bottom, width, height;
    Rectangle(double left, double bottom, double width, double height) {
        this.left = left;
        this.bottom = bottom;
        this.width = width;
        this.height = height;
    }
    boolean inside(double x, double y) {
        return left<=x&&x<=left+width&&bottom<=y&&y<=bottom+height;
    }
    public double getArea(){
        return width*height;
    }
}

// ファイル RectangleTest2
class RectangleTest2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.0, 2.0, 5.0, 3.0);
        Rectangle r2 = new Rectangle(1.0, 1.0, 4.0, 3.5);
        Draw.draw(r1, 0.0, 7.0, 0.25,
                0.0, 6.0, 0.5);
        PrintArea.printArea(r1);
        System.out.println("------------------------------------------------");
        Draw.draw(r2, 0.0, 7.0, 0.25,
                0.0, 6.0, 0.5);
        PrintArea.printArea(r2);
    }
}

