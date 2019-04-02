package com.code;
public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle(2.3,4.3);
        shapes[2] = new Square("red",true,4.0);
        //Colorable and Show Arrays
        System.out.println("Arrays Shape:");
        for (Shape shape:shapes){
            if (shape instanceof Square){
                System.out.print(shape + ", And ");
                ((Square) shape).howtocolor();
            }else {
                System.out.println(shape);
            }
        }
    }
}
