package com.xyz;

class Prime {
    int isprime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a % i == 0)
                return 0;
        return 1;
    }

    void disp() {
        for (int i = 100; i <= 200; i++) {
            int p = isprime(i);
            if (p == 1)
                System.out.print(i + " ");
        }
    }
}
public class Q2{
    public static void main(String[] args){
        Prime p = new Prime();
        p.disp();
    }
    }

