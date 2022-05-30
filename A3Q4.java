
interface P {
    String p = "interface P";
    void methodP();
}

interface P1 extends P {
    String p1 = "interface P1";
    void methodP1();
}

interface P2 extends P {
    String p2 = "interface P2";
    void methodP2();
}

interface P12 extends P1, P2 {
    String p12 = "interface P12";
    void methodP12();
}

class Q implements P12{

    public void methodP() {
        System.out.println(p);
    }

    public void methodP1() {
        System.out.println(p1);
    }

    public void methodP2() {
        System.out.println(p2);
    }

    public void methodP12() {
        System.out.println(p12);
    }
}

public class A3Q4{
    public static void main (String[] args) {
        Q q = new Q();
        q.methodP();
        q.methodP1();
        q.methodP2();
        q.methodP12();
    }
}