package com.xyz;

class S1 {
    int s1;
    S1()
    {
        System.out.println("Constructor S1 executing");
    }
}
class T1 extends S1
{
    int t1;
    T1()
    {
        System.out.println("Constructor T1 executing");
    }
}
class U1 extends T1
{
    int u1;
    U1(int s1,int t1,int u1)
    {
        System.out.println("Constructor U1 executing");
        this.s1=s1;
        this.t1=t1;
        this.u1=u1;
    }
    public static void main(String args[])
    {

        U1 u=new U1(5,6,7);
    }
}


