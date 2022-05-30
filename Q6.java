package com.xyz;

class  Object{
}
class M extends Object
{
    float f;String str;
}
class N extends M
{
    double d;
    N(double d,float f,String str)
    {
        this.f=f;
        this.str=str;
        this.d=d;
    }
    void disp()
    {
        System.out.println("M variables : "+ f+ " "+ str);
        System.out.println("N variable : " + d);
    }
    public static void main(String args[])
    {
        N n = new N(5,6,"Taylor");
        n.disp();
    }
}

