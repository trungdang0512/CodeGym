package SS14_ExceptionDebug.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y: " + a);
            System.out.println("Hiệu x - y: " + b);
            System.out.println("Tích x * y: " + c);
            System.out.println("Thương x / y: " + d);
        } catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);

    }
}
