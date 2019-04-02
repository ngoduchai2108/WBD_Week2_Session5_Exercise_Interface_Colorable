package com.code;

public class RectangleTest extends Shape {
    public static void main(String[] args) {
        //constructor with no parameter
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        //constructor with tow parameter
        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        //constructor with four parameter
        rectangle = new Rectangle("orange",true,2.3,5.8);
        System.out.println(rectangle);
    }
}
