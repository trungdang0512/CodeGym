package SS02_Loop.bai_tap.hien_thi_hinh;

import java.util.Scanner;

public class Hien_thi_hinh_vuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập chiều dài: ");
        int a = scanner.nextInt();

        System.out.printf("Nhập chiều rộng: ");
        int b = scanner.nextInt();

        for (int i=0; i < a; i++){
            for (int j=0; j <b; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
