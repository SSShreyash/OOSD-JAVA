package com.xyz;

class Circle {
    double radius,x,y;
    Circle(double radius)
    {
        this.radius=radius;
        x=0;
        y=0;
    }
    Circle(double x,double y,double radius)
    {
        this.radius=radius;
        this.x=x;
        this.y=y;
    }
    void disp()
    {
        System.out.println("The centre is ("+x+","+y+")");
        System.out.println("The radius is "+radius);
    }
    public static void main(String args[])
    {
        Circle c1= new Circle(5);
        Circle c2= new Circle(2,5,5);
        c1.disp();
        c2.disp();
    }
}
