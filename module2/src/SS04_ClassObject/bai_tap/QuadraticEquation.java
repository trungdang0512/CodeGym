package SS04_ClassObject.bai_tap;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
    }

    public QuadraticEquation( double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(double a, double b, double c){
        double delta = Math.pow(b,2) - 4*a*c;
        return delta;
    }

    public double getRoot1(double a, double b, double c){
        double r1 = (-b + Math.pow(Math.pow(b,2) - 4*a*c,0.5))/2*a;
        return r1;
    }

    public double getRoot2(double a, double b, double c){
        double r2 = (-b - Math.pow(Math.pow(b,2) - 4*a*c,0.5))/2*a;
        return r2;
    }
}
