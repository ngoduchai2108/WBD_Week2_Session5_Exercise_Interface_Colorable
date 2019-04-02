package com.code;

public class CircleTest {
    public static void main(String[] args) {
        //constructor with no parameter
        Circle circle = new Circle();
        System.out.println(circle);
        //constructor with one parameter
        circle = new Circle(3.5);
        System.out.println(circle);
        //constructor with three parameter
        circle = new Circle("indigo",false,3.5);
        System.out.println(circle);
    }
}
