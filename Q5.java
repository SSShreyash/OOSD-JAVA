package com.xyz;

class Rock {
    double m;
    Rock()
    {
        m=10*Math.random();
    }
    void disp(int i)
    {
        System.out.println("Mass of rock "+i+" : "+m);
    }
    public static void main(String args[])
    {
        double sum=0;
        Rock[] rocks=new Rock[10];
        for(int i=0;i<10;i++)
        {
            rocks[i]=new Rock();
            rocks[i].disp(i);
            sum+=rocks[i].m;
        }
        System.out.println("Total mass : "+ sum);
    }
}
