package SS02_Loop.bai_tap.hien_thi_hinh;

import java.util.Scanner;

public class Hien_thi_tam_giac_botton_left {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập số độ dài: ");
        int a = scanner.nextInt();

        for ( int i=1; i <= a; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
