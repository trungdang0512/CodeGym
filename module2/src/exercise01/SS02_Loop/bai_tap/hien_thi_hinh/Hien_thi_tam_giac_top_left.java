package exercise01.SS02_Loop.bai_tap.hien_thi_hinh;

import java.util.Scanner;

public class Hien_thi_tam_giac_top_left {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập độ dài: ");
        int a = scanner.nextInt();

        for (int i = a; i >= 1; i--){
            for (int f = 1; f <= i; f++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
