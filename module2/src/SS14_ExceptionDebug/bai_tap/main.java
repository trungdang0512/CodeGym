package SS14_ExceptionDebug.bai_tap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleCheck triangleCheck = new TriangleCheck();

        try{
            System.out.println("Nhập cạnh thứ 1: ");
            double a = scanner.nextDouble();
            System.out.println("Nhập cạnh thứ 2: ");
            double b = scanner.nextDouble();
            System.out.println("Nhập cạnh thứ 3: ");
            double c = scanner.nextDouble();

            try {
                triangleCheck.checkTriangle(a,b,c);
            } catch (TriangleException ex){
                System.out.println(ex.getMessage());
            }
        }catch (Exception e){
            System.err.println("Error: Không đúng định dạng!!");
        }
    }
}
