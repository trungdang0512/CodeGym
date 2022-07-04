package SS07_AbstractClass_Interface.bai_tap.resizeable;

import SS06_KeThua.thuc_hanh.Shape;

import java.util.concurrent.ThreadLocalRandom;

public class Circle extends Shape implements Resizeable {
    public double radius = 1.0;


    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }


    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius()
                + ", which is a sub class of "
                + super.toString();
    }

    @Override
    public double resize(double random){
        return getRadius()* random;
    }
}