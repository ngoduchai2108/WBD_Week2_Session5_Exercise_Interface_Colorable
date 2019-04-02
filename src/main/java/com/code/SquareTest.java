package com.code;

public class SquareTest {
    public static void main(String[] args) {
        //constructor with not parameter
        Square square = new Square();
        System.out.println(square);
        //constructor with one parameter
        square = new Square(2.3);
        System.out.println(square);
        //constructor with four parameter
        square = new Square("red",true,5.8);
        System.out.println(square);
    }
}
