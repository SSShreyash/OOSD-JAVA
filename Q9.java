package com.xyz;

abstract class Fruit {
    public static void main(String args[])
    {
        Apple a = new Apple();
        Banana b = new Banana();
        Orange o = new Orange();
        Strawberry s = new Strawberry();
        System.out.println(a.toString() + " " + a.colour);
        System.out.println(b.toString() + " " + b.colour);
        System.out.println(o.toString() + " " + o.colour);
        System.out.println(s.toString() + " " + s.colour);
    }
}
class Apple extends Fruit
{
    String colour = "Red";
}
class Banana extends Fruit
{
    String colour = "Yellow";
}
class Orange extends Fruit
{
    String colour = "Orange";
}
class Strawberry extends Fruit
{
    String colour = "Pink";
}
