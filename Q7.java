package com.xyz;

class G {
    static int x=5;
}
class H extends G
{
    int x=10;
    void disp()
    {
        System.out.println("Gx="+super.x);
        System.out.println("Hx="+x);
    }
    public static void main(String args[])
    {
        H h=new H();
        h.disp();
    }

}