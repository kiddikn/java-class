class X {
    X() { System.out.println("[X]");}
    void a() { System.out.println("[x.a]");}
    void b() { System.out.println("[x.b]");}
}
class Y extends X {
    Y() { System.out.println("[Y]"); }
    void a() { System.out.println("[y.a]"); }
}


public class Test{                                                                                                                                                   
    public static void main(String[] args){
        X x = new X();
        x.a();
        x.b();
        System.out.println("c");
        Y y = new Y();
        y.a();
        y.b();
    }
}

