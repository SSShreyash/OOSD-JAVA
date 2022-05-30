interface L1 {}
interface L2 {}
interface L3 extends L1, L2 {}
interface L4 {}
class X implements L3 {}
class W extends X implements L4 {}

public class A3Q6 {
    public static void main (String[] args) {
        L1 objL1 = new X();
        System.out.println ("Object objL1 is instance of " +
                "L1 of type X = " + (objL1 instanceof X));

        L2 objL2 = new X();
        System.out.println ("Object objL2 is instance of " +
                "L2 of type X = " + (objL2 instanceof X));

        L3 objL3 = new X();
        System.out.println("Object objL3 is instance of " +
                "L3 of type X = " + (objL3 instanceof X));

        L4 objL4 = new W();
        System.out.println("Object objL4 is instance of " +
                "L4 of type W = " + (objL4 instanceof W));
    }
}