package exercise01.SS06_KeThua.bai_tap.BT_Circle_Cylinder;

public class Cylinder extends Circle{
    private double height=1.0;

    public Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * getArea() * getArea() * height;
    }
}
