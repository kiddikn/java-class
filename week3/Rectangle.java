//演習問題Rectangle計算
//コンストラクタとメソッド
class Rectangle{
    double width;
    double height;

    double getArea(){
        return this.width*this.height;
    }

    //コンストラクタ
    Rectangle(double w,double h){
        this.width = w;
        this.height = h;
    }

    boolean isLarger(Rectangle r){
        return getArea() > r.getArea();
    }
}


