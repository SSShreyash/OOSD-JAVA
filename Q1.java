package com.xyz;

class Fib {

    void fib() {
        int i;
        int x = 0, y = 1, z;
        System.out.print(x + " " + y + " ");
        for (i = 2; i <= 15; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.print(z + " ");
        }
    }
}

public class Q1 {

    public static void main(String[] args) {
        Fib Obj = new Fib();
        Obj.fib();
    }
}
