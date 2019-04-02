package com.code;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color_, boolean filled_, double size) {
        super(color_,filled_,size,size);
    }
    public double getSize(){
        return getWidth_();
    }
    public void setSize(double size){
        setWidth_(size);
        setHeight_(size);
    }

    @Override
    public void setWidth_(double width_) {
        setSize(width_);
    }

    @Override
    public void setHeight_(double height_) {
        setSize(height_);
    }

    @Override
    public String toString() {
        return "A Square with size = "+getSize()+", which is subclass of "+ super.toString();
    }

    @Override
    public void howtocolor() {
        System.out.println("Color all four side.");
    }
}
