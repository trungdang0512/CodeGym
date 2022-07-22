package SS14_ExceptionDebug.bai_tap;

public class TriangleCheck {
    public void checkTriangle(double a, double b, double c) throws TriangleException{
        if ( a + b <= c || a + c <= b || b + c <= a){
            throw new TriangleException("Error: Tam giác không hợp lệ!!!");
        }else {
            System.out.println("Tam giác hợp lệ !!!");
        }
    }
}
