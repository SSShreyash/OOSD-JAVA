package com.xyz;

class Super{
int x,y;
}

class Sub extends Super{
Sub(int x, int y){
    this.x = x;
    this.y = y;
}

void disp(){
    System.out.println("x + y = " + x+y);
}
}

public class Q1a{
public static void main(){
    Sub res = new Sub(5,10);
    res.disp();
}
}
