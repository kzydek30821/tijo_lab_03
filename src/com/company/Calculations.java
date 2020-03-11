package com.company;

public class Calculations {
    public static Point2D positionGeometricCenter(Point2D[] point){
        double tmp_x = 0;
        double tmp_y = 0;

        for (int i=0;i<point.length;i++){
            tmp_x = tmp_x + point[i].x;
            tmp_y = tmp_y + point[i].y;
        }
        return new Point2D(tmp_x/point.length,tmp_y/point.length);
    }
    public static Point2D positionCenterOfMass(MaterialPoint2D[] materialPoint){
        double tmp_x = 0;
        double tmp_y = 0;
        double mass = 0;

        for (int i=0;i<materialPoint.length;i++){
            tmp_x = tmp_x + materialPoint[i].mass * materialPoint[i].x;
            tmp_y = tmp_y + materialPoint[i].mass * materialPoint[i].y;
            mass = mass + materialPoint[i].mass;
        }
        return new MaterialPoint2D(tmp_x/mass,tmp_y/mass,mass);
    }
}
