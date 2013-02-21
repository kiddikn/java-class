class X {
    X() { System.out.println("[X()]");}
    X(int i) { System.out.println("[X(int i)]");}
}
class Y extends X {
    Y() { System.out.println("[Y()]"); }
    Y(int i) { System.out.println("[Y(int i)]"); }
}
class Z extends Y {}
class C {C(){System.out.println("C()");}}
public class Kadai{                                                                                                                                                   
    public static void main(String[] args){
        Y y0 = new Y();
        Y y1 = new Y(10);
        Z z = new Z();
        System.out.println("c");
      // Y y = new C(); false
        C c = new C();
        X x = new Y();
      //  Y y = new X();  false
          }
}

