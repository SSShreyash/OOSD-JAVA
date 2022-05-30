
interface Material {
    String ball = "Plastic";
    String coin = "Ferratic stainless steel";
    String ring = "Gold";

    void displayMaterial();
}

abstract class MatObject implements Material {
    String material;

    public static void main(String[] args) {
        MatObject objectBall = new Ball(Material.ball);
        objectBall.displayMaterial();

        MatObject objectCoin = new Coin(Material.coin);
        objectCoin.displayMaterial();

        MatObject objectRing = new Ring(Material.ring);
        objectRing.displayMaterial();
    }
}

class Ball extends MatObject {
    Ball (String material) {
        this.material = material;
    }

    public void displayMaterial() {
        System.out.println(this.getClass().getName() + " is made up of " +
                this.material);
    }
}

class Coin extends MatObject {
    Coin (String material) {
        this.material = material;
    }

    public void displayMaterial() {
        System.out.println(this.getClass().getName() + " is made up of " +
                this.material);
    }
}

class Ring extends MatObject {
    Ring (String material) {
        this.material = material;
    }

    public void displayMaterial() {
        System.out.println(this.getClass().getName() + " is made up of " +
                this.material);
    }
}
