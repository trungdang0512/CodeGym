package SS02_Loop.thuc_hanh;

import java.util.Scanner;

public class uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a: ");
        a = scanner.nextInt();
        System.out.println("Input number b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if ( a == 0 || b == 0){
            System.out.println("Khong co UCLN");
        }
        while ( a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("UCLN cua 2 so la: " +a);

    }
}
