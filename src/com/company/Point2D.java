package com.company;

public class Point2D {
    protected double x;
    protected double y;

    public Point2D(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString(){
        return "Point2D (" +
                "x = " + x +
                ", y= " + y +
                ")";
    }
}
