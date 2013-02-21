// ファイルShape.java
abstract class Shape {
    // 抽象メソッド
    // (x, y)が図形の内側ならtrueを，そうでなければfalseを返すものとする．
    // ちょうど境界線上は内側とみなす約束とする．
    abstract boolean inside(double x, double y); 
}

// ファイルDraw.java
// Shapeを描画するクラスメソッドdrawを持っている．
class Draw {
    // x座標: x1からx2までxstep刻み
    // y座標: y1からy2までystep刻み
    // (x, y)が図形sの内側なら*を，そうでなければ空白を書く．
    static void draw(Shape s,
            double x1, double x2, double xstep,
            double y1, double y2, double ystep) {
        for (double y = y2; y >= y1; y -= ystep) {
            for (double x = x1; x <= x2; x += xstep) {
                if (s.inside(x, y)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// ファイルCircle.java
class Circle extends Shape {
    double x0, y0, r;  // 中心座標(x0, y0), 半径r
    Circle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }
    boolean inside(double x, double y) {
        return (x - x0) * (x - x0) + (y - y0) * (y - y0) <= r * r;
    }
}

// ファイルCircleTest.java
class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, 5.0, 3.0);
        Draw.draw(c, 0.0, 10.0, 0.25,
                0.0, 10.0, 0.5);
    }
}

//ファイルRectangle.java

class Rectangle extends Shape {
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
}

//ファイルRectangleTest.java
class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.0, 2.0, 5.0, 3.0);
        Rectangle r2 = new Rectangle(1.0, 1.0, 4.0, 3.5);
        Draw.draw(r1, 0.0, 7.0, 0.25,
                0.0, 6.0, 0.5);
        System.out.println("------------------------------------------------");
        Draw.draw(r2, 0.0, 7.0, 0.25,
                0.0, 6.0, 0.5);
    }
}

// ファイルParabola.java
class Parabola extends Shape {
    double a, b, c;  // a * x^2 + b * x + c = 0
    Parabola(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    boolean inside(double x,double y){
        return a*x*x+b*x+c-y>=0;
    }
}

// ファイル ParabolaTest.java
class ParabolaTest {
    public static void main(String[] args) {
        Parabola p = new Parabola(-1, 6, -5);
        Draw.draw(p, 0.0, 6.0, 0.15,
                0.0, 5.0, 0.3);
    }
}
