package com.company;

public class MaterialPoint2D extends Point2D {
    protected double mass;
    public MaterialPoint2D(double x,double y,double mass){
        super(x,y);
        this.mass = mass;
    }

    @Override
    public String toString(){
        return "MaterialPoint2D (" +
                "x = " + x +
                ", y = " + y +
                ", mass = " + mass +
                ")";
    }
}
