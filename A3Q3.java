interface LuminousObject {
    void lightOff();
    void lightOn();
}

class SolidObject implements LuminousObject {
    public void lightOff() {
        System.out.println("Luminous Object Light Off");
    }

    public void lightOn() {
        System.out.println("Luminous Object Light On");
    }
}

class Cone extends SolidObject {
}

class LuminousCone extends Cone implements LuminousObject {
    public void lightOn() {
        System.out.println("Luminous Cone Light On");
    }

    public void lightOff() {
        System.out.println("Luminous Cone Light Off");
    }
}

class Cube {
}

class LuminousCube extends Cube implements LuminousObject {

    public void lightOff() {
        System.out.println("Luminous Cube Lights Off");
    }

    public void lightOn() {
        System.out.println("Luminous Cube Lights On");
    }
}

class A3Q3{
    public static void main (String[] args) {
        SolidObject solidObject = new SolidObject();
        solidObject.lightOn();
        solidObject.lightOff();

        System.out.println();

        // invoking via interface reference
        LuminousObject luminousObject = new LuminousCone();
        luminousObject.lightOn();
        luminousObject.lightOff();

        System.out.println();

        // invoking via interface reference
        LuminousObject luminousObject1 = new LuminousCube();
        luminousObject1.lightOn();
        luminousObject1.lightOff();
    }
}